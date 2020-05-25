package lab10

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object Lab10 {

  def main(args: Array[String]): Unit = {
    val sparkConfiguration = new SparkConf().setAppName("Lab10").setMaster("local[*]")
    val sparkContext = new SparkContext(sparkConfiguration);
    val sparkSession = SparkSession.builder.appName("Test app").getOrCreate()
    val datafile = sparkSession.read
      .format("com.databricks.spark.csv")
      .option("header", true)
      .load("./HRR_Scorecard.csv")
    datafile.createOrReplaceTempView("HRR_Scorecard")

    // Максимальное количество необходимых мест для больных за 6 месяцев
    sparkSession.sql("select `HRR`, MAX(`Hospital Beds Needed, Six Months`) as `Beds Needed` FROM HRR_Scorecard group by `HRR` order by `Beds Needed` desc").show()

    // Максимальное количество прогнозируемых зараженных COVID-19 в США старше 18 лет
    sparkSession.sql("select MAX(`Projected Infected Individuals`) as max FROM HRR_Scorecard group by `HRR`").show()

    // Среднее количество пенсионеров в больницах США
    sparkSession.sql("select `HRR`, AVG(`Population 65+`) as `Number of Pensioners` FROM HRR_Scorecard group by `HRR`").show()

    // Количество доступных мест в ICU в порядке убывания
    sparkSession.sql("select `HRR`, `Available ICU Beds` FROM HRR_Scorecard WHERE order by `Available ICU Beds` desc").show()

    // Наибольшее количество мест в больницах Hospital (больше 100)
    sparkSession.sql("select `HRR`, `Total ICU Beds` FROM HRR_Scorecard WHERE `Total Hospital Beds` > 100").show()

    sparkSession.stop()
  }

}