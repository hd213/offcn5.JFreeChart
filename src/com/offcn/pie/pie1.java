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
		dataset.setValue("�µ�Q5", 9889);
		dataset.setValue("����GLC", 9006);
		dataset.setValue("�µ�Q3", 7609);
		dataset.setValue("����X1", 7451);
		dataset.setValue("��������XT5", 3711);
		dataset.setValue("����GLA", 6008);
		dataset.setValue("��������", 3429);
		dataset.setValue("�ֶ���XV60", 3300);
		dataset.setValue("��ʤ����", 1518);
		dataset.setValue("ک��CDX", 1013);
		dataset.setValue("Ӣ�����QX50", 518);
		
		JFreeChart chart = ChartFactory.createPieChart3D("2017��7�º���SUV����ͳ�Ʊ�", dataset, true, true, false);
		
		PiePlot piePlot = (PiePlot) chart.getPlot();
		piePlot.setLabelFont(new Font("����", 0,12));
		piePlot.setNoDataMessage("����δ���أ�");
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
