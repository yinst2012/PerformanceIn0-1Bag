package yinst.Algorithm;

import java.io.IOException;

public class testDemo {
	
	public static void main(String[] args) throws IOException{
		//double[] p = {0.33, 0.5, 0.66};
		//for(int j = 0; j < 3; ++ j){
		for(int i = 0; i < 50; ++ i){
			RandomBag bag = new RandomBag();
			bag.createABag(1000, 0.66);
			//System.out.println("背包体积是：" + bag.V);
			//贪心
			GreedyAlgorithm ga = new GreedyAlgorithm();
			ga.makeBox(bag);
			ga.Knapsack();
			//动态规划
			DynamicProgram dp = new DynamicProgram();
			dp.DP(bag);
			//分支限界
			BranchBound bb = new BranchBound();
			bb.fineTuningBag(bag);
			//遗传算法, 种群规模，最大代数，交叉
			GeneticAlgorithm ga1 = new GeneticAlgorithm(bag, 50, 100, 0.5f, 0.05f, 0.1f);
			ga1.solve();
			GeneticAlgorithm ga2 = new GeneticAlgorithm(bag, 50, 200, 0.5f, 0.05f, 0.1f);
			ga2.solve();
			GeneticAlgorithm ga3 = new GeneticAlgorithm(bag, 50, 500, 0.5f, 0.05f, 0.1f);
			ga3.solve();
			GeneticAlgorithm ga4 = new GeneticAlgorithm(bag, 20, 200, 0.5f, 0.05f, 0.1f);
			ga4.solve();
			GeneticAlgorithm ga5 = new GeneticAlgorithm(bag, 100, 200, 0.5f, 0.05f, 0.1f);
			ga5.solve();
		}
	//	System.out.println("===============================");
	//	}
	}
}
