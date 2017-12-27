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
	/*==����һ��============================
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(100, "����", "ӣ��");
		dataset.addValue(120, "����", "����");
		dataset.addValue(200, "����", "��֦");
		dataset.addValue(110, "����", "â��");
	=======================================*/
	/*==��������=============================*/
		double[][] arg2={{100,120,200,110},{130,120,120,170},{200,120,120,140}};
		String[] arg0={"����","�Ϻ�","����"};
		String[] arg1={"ƻ��","ӣ��","â��","��֦"};
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(arg0, arg1, arg2);
	/*=======================================*/
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ","ˮ������", "����/kg", dataset, PlotOrientation.VERTICAL, true, true, false);
		
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
