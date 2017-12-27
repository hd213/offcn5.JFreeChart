package comoffcn.line;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Line1 {

	public static void main(String[] args) {
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(23210.77, "�ɽ����/�O", "����");
		dataset.addValue(47013.00, "�ɽ����/�O", "�Ϻ�");
		dataset.addValue(3145.38, "�ɽ����/�O", "����");
		dataset.addValue(11664.61, "�ɽ����/�O", "�ɶ�");
		dataset.addValue(17512.91, "�ɽ����/�O", "����");
		dataset.addValue(0.00, "�ɽ����/�O", "����");
		dataset.addValue(16371.00, "�ɽ����/�O", "�Ͼ�");
		dataset.addValue(25437.63, "�ɽ����/�O", "��ݸ");
		
		
		JFreeChart chart = ChartFactory.createBarChart("���ز�����ͳ��ͼ", "����", "�ɽ����/�O", dataset, PlotOrientation.VERTICAL,true, true, false);
		
		CategoryPlot polt = chart.getCategoryPlot();
		
		CategoryItemRenderer render = polt.getRenderer();
		
		render.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		
		render.setBaseItemLabelsVisible(true);
		
		try {
			ChartUtilities.writeChartAsJPEG(new FileOutputStream("D:\\images\\1.jpg"), chart, 700, 400);
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
