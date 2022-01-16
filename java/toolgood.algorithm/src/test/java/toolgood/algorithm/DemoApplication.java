package toolgood.algorithm;

import static org.junit.Assert.assertEquals;

import toolgood.algorithm.Test2.Desk;
import toolgood.algorithm.Test2.PriceAlgorithm;

// import org.springframework.core.io.ClassPathResource;
// import org.springframework.util.StopWatch;

public class DemoApplication {
	public static void main(String[] args) throws Exception {
        AlgorithmEngine e=new AlgorithmEngine();
        int t= e.TryEvaluate("1>2?1:2", 0);
        if (t!=2){
            System.out.println(t);
        }
    }
}