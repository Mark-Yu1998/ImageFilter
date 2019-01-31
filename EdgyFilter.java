package filter_Processor;

public class EdgyFilter implements Filter {

	@Override
	public void filter(PixelImage theImage) {
		// TODO Auto-generated method stub
		int[][] weight = {{-1,-1,-1},{-1,9,-1},{-1,-1,-1}};
		Pixel[][] data = theImage.getData();
		data = theImage.calculate(weight,data,false);
		theImage.setData(data);
	}
	
	
}
