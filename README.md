# PerformanceIn0-1Bag

Simply open with Eclipse...

关于几个函数类
RandomBag
/**
    * @param NumOfProblem : 问题规模
    * @param weight[] : 物品质量
    * @param value[] : 物品价值
    * @param   V :    背包体积
    * @param pareOfV : 根据物体质量确定背包体积的参数 v = sum(weight)*pareOfV;
   createABag(int n, double pv) : 问题规模与根据背包总质量确定背包容量的参数pv
*/
    
GeneticAlogrithm
/**
	 * @param capacity : 背包容量
	 * @param scale ： 种群规模
	 * @param maxgen ： 最大代数
	 * @param irate ： 交叉率（所有的个体都需要相互交叉的，这里的交叉率指交叉时每位交叉发生交叉的可能性）
	 * @param arate1 ：变异率（某个个体发生变异的可能性）
	 * @param arate2 ：对于确定发生变异的个体每位发生变异的可能性
	public GeneticAlgorithm(RandomBag rb, int scale, int maxgen, float irate, float arate1, float arate2)
*/
  
