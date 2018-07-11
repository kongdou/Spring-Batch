package fun.deepsky.springbatch.writer.router;

import org.springframework.classify.annotation.Classifier;

public class CreditBillRouterClassifier {

	@Classifier
	public String classify(CreditBill classifiable) {
		if(classifiable.getAmount() > 500){
			return "large";
		}else{
			return "small";
		}
	}
}
