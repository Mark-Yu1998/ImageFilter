package filter_Processor;

public class GaussianFilter implements Filter {
	public void filter(PixelImage pi) {
		// weights of the transformation
		int[][] weights = { { 1, 2, 1 }, { 2, 4, 2 }, { 1, 2, 1 } };
		// Create a transformation method in the PixelImage class
		Pixel[][] data = pi.getData();
		// call it here as
		//We need scaling
		data = pi.calculate(weights, data, true);
		// pi.transformImage(weights);
		pi.setData(data);
	}
}