public class Program {

    public static void main(String[] args) {

//
//        double leftVal[] = {2.0d, 40.7d, 20.0d, 10.0d  };
//        double rightVal[]= {1.0d, 4.0d, 15.0d, 5.0d};
//        char opCodes[] = {'a', 'd','s','m'};
//        double results [] = new double[opCodes.length];

//        for(int i=0; i<opCodes.length; i++) {
//            switch (opCodes[i]) {
//                case 'a': {
//                    result[i] = leftVal[i] + rightVal[i];
//                }
//                break;
//                case 's': {
//                    result[i] = leftVal[i] - rightVal[i];
//                }
//                break;
//                case 'm': {
//                    result[i] = leftVal[i] * rightVal[i];
//                }
//                break;
//                case 'd': {
//                    result[i] = rightVal[i] != 0.0d ? leftVal[i] + rightVal[i] : 0.0d;
//                }
//                break;
//                default:{
//                    System.out.println("Wrong opCode");
//                }
//            }

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(2.0d, 1.0d, 'a');
        equations[1] = create(40.7d, 4.0d, 'd');
        equations[2] = create(20.d, 15.0d, 's');
        equations[3] = create(10.0d, 5.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result : " + equation.getResult());
        }

    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;

    }
}


