package Calc;

import Calc.Model.I__Model;
import Calc.View.GetOperation;
import Calc.View.GetValue;

public class Presenter {
    GetValue value;
    GetOperation operation;
    I__Model model;



    public Presenter(I__Model m, GetValue v, GetOperation op) {
        model = m;
        value = v;
        operation = op;
    }

    public void buttonClick(){
        int a = value.getValue("a: ");
        int b = value.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int res = model.result();
        value.print(res, "результат операции: ");
    }
}
