package filter_Processor;

public class UnsharpMasking implements Filter{
	int[][] weight = {{-1,-2,-1},{-2,28,-2},{-1,-2,-1}};

	@Override
	public void filter(PixelImage theImage) {
		Pixel[][] data = theImage.getData();
		data = theImage.calculate(weight,data, true);
		theImage.setData(data);
	}
	
	
}
