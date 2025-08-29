package Splitwise.SplitFactory;

import Splitwise.SplitType;

public class SplitFactory{

    public static SplitInterface getSplitType(SplitType splitType){
        return switch (splitType){
            case EQUAL -> new EqualSplitInterface();
            case UNEQUAL -> new UnequalSplitInterface();
            case PERCENTAGE -> new PercentageSplitInterface();
            default -> new EqualSplitInterface();
        };
    }
}
