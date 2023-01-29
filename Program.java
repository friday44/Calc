package Calc;

import Calc.Model.ResultModel;
import Calc.View.GetOperation;
import Calc.View.GetValue;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new ResultModel(), new GetValue(), new GetOperation());
        p.buttonClick();
    }
}
