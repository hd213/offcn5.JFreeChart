package com.offcn.pie;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class pie1 {
	
	public static void main(String[] arg){
		
		DefaultPieDataset dataset  = new DefaultPieDataset();
		dataset.setValue("奥迪Q5", 9889);
		dataset.setValue("奔驰GLC", 9006);
		dataset.setValue("奥迪Q3", 7609);
		dataset.setValue("宝马X1", 7451);
		dataset.setValue("凯迪拉克XT5", 3711);
		dataset.setValue("奔驰GLA", 6008);
		dataset.setValue("发现神行", 3429);
		dataset.setValue("沃尔沃XV60", 3300);
		dataset.setValue("揽胜极光", 1518);
		dataset.setValue("讴歌CDX", 1013);
		dataset.setValue("英菲尼迪QX50", 518);
		
		JFreeChart chart = ChartFactory.createPieChart3D("2017年7月豪华SUV销量统计表", dataset, true, true, false);
		
		PiePlot piePlot = (PiePlot) chart.getPlot();
		piePlot.setLabelFont(new Font("宋体", 0,12));
		piePlot.setNoDataMessage("数据未加载！");
		StandardPieSectionLabelGenerator pielable = new StandardPieSectionLabelGenerator("{0}:{1}-{2}",NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());
		piePlot.setLabelGenerator(pielable);
		
		PiePlot3D piePlot3D = (PiePlot3D) chart.getPlot();
		piePlot3D.setStartAngle(180D);
		piePlot3D.setDirection(Rotation.ANTICLOCKWISE);
		/*piePlot3D .setForegroundAlpha(0.5F);*/
		
		try {
			ChartUtilities.saveChartAsJPEG(new File("D:\\images\\2.jpg"), chart,900, 500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
