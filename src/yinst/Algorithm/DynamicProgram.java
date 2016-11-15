package yinst.Algorithm;

public class DynamicProgram {
	int[][] optp;
	void DP(RandomBag b){
		int i, j;
		int n = b.NumOfProblem;
		int m = b.V;  //the volume of bag
		//remember to initial the first row and first column to 0
		optp = new int[n+1][m+1];
		long t1 = System.currentTimeMillis();
		for(i = 1; i <= n; ++ i){
			for(j = 1; j <= m; ++ j){
				optp[i][j] = optp[i-1][j];
				if((j >= b.weight[i-1]) && (optp[i-1][j-b.weight[i-1]] + b.value[i-1] > optp[i-1][j]))
					optp[i][j] = optp[i-1][j-b.weight[i-1]] + b.value[i-1];
			}
		}
		long t2 = System.currentTimeMillis();
//		j = m;
//		for(i = n; i > 0; -- i){
//			if(optp[i][j] > optp[i-1][j]){
//				b.isPut[i-1] = true;
//				j = j - b.weight[i-1];
//			}
//				
//		}
		System.out.println(optp[n][m] + " " + (t2-t1));
	}
}
