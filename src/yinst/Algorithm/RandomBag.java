package yinst.Algorithm;

import java.util.Random;

public class RandomBag {

		int NumOfProblem; //问题规模
		int[] weight;  
		int[] value;
		int V;    //背包体积
		boolean[] isPut;
		double pareOfV; //根据物体质量确定背包体积的参数 v = sum(weight)*pareOfV;
		
		void createABag(int n, double pv){
			NumOfProblem = n;
			pareOfV = pv;
			weight = new int[n];
			value = new int[n];
			isPut = new boolean[n];
			Random r = new Random();
			int sum = 0;
			for(int i = 0; i < n; ++ i){
				weight[i] = r.nextInt(100) + 1;
				value[i] = r.nextInt(100) + 1;
				sum += weight[i];
			}
			V = (int) (sum * pareOfV);
		}
	
}
