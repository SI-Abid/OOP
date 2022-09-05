
class Layer_1 {
    private static int data;
   
    public static void setData2(int data) {
        Layer_2.data = data;
    }
    public static int getData2() {
        return Layer_2.data;
    }

    static class Layer_2 {              
        private static int data;
        public static void setData3(int data) {
            Layer_3.data = data;
        }
        public static int getData3() {
            return Layer_3.data;
        }

        static class Layer_3 {
            private static int data;
            public static void setData1(int data) {
                Layer_1.data = data;
            }
            public static int getData1() {
                return Layer_1.data;
            }
        }
    }
}

public class J_xi {
    public static void main(String[] args) {

        Layer_1.setData2(10);
        Layer_1.Layer_2.setData3(20);
        Layer_1.Layer_2.Layer_3.setData1(30);

        System.out.println("Layer 2 data = " + Layer_1.getData2());
        System.out.println("Layer 3 data = " + Layer_1.Layer_2.getData3());
        System.out.println("Layer 1 data = " + Layer_1.Layer_2.Layer_3.getData1());
        
    }
}
