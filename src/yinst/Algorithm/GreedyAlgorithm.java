package yinst.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithm {
	public static class tripleBox{
		double w;
		double v;
		double d;
		public static final Comparator<tripleBox> tripleBoxCmp = new Comparator<tripleBox>(){
			public int compare(tripleBox tb1, tripleBox tb2){
				double t = tb1.d - tb2.d;
				if(t >= 0) return -1;
				else return 1;
			}
		};
	}
	public tripleBox[] tb;
	double c;
	double[] x;
	
	void makeBox(RandomBag b){
		int n = b.NumOfProblem;
		tb = new tripleBox[n];
		for(int i = 0; i < n; ++ i){
			tb[i] = new tripleBox();
			tb[i].w = (double)b.weight[i];
			tb[i].v = (double)b.value[i];
			tb[i].d = tb[i].v / tb[i].w;
		}
		c = (double)b.V;
		x = new double[b.NumOfProblem];
	}
	
	void Knapsack(){
		long t1 = System.currentTimeMillis();
		Arrays.sort(tb, tripleBox.tripleBoxCmp);
		int i, sum = 0;
		for(i = 0; i < tb.length; ++ i) x[i] = 0.0;
		for(i = 0; i < tb.length; ++ i){
			//System.out.println(tb[i].d + " " + tb[i].w + " " + tb[i].v);
			if(tb[i].w > c) break;
			x[i] = 1.0;
			c -= tb[i].w;
			sum += (int)tb[i].v;
		}
		long t2 = System.currentTimeMillis();
		System.out.println(sum + " " + (t2-t1));
	}
	
}
