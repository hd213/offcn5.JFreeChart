package com.offcn.bar;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class bar1 {
	
	public static void main(String[] arg){
	/*==方法一、============================
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(100, "北京", "樱桃");
		dataset.addValue(120, "北京", "红提");
		dataset.addValue(200, "北京", "荔枝");
		dataset.addValue(110, "北京", "芒果");
	=======================================*/
	/*==方法二、=============================*/
		double[][] arg2={{100,120,200,110},{130,120,120,170},{200,120,120,140}};
		String[] arg0={"北京","上海","深圳"};
		String[] arg1={"苹果","樱桃","芒果","荔枝"};
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(arg0, arg1, arg2);
	/*=======================================*/
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图","水果种类", "重量/kg", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		try {
//			ChartUtilities.saveChartAsJPEG(new File("D:\\images\\bar1.jpg"), chart, 700, 400);
			ChartUtilities.writeChartAsJPEG(new FileOutputStream("D:\\images\\bar1.jpg"), chart, 700, 400);
			System.out.println("OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
