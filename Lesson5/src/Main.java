public class Main {
    public static void main(String[] args) {
        final int size = 10000000;          //размерность массива
        final int threadsCount = 6;         //количество потоков
        final int h = size / threadsCount;  //количество всех элементов делёное на количество потоков

        float[] arr = new float[size];      //создаём массив
        for (int i = 0; i < size; i++) {    //заполняем массив единицами
            arr[i] = 1;
        }

        long b = System.currentTimeMillis();    //засекаем время выполнения всем программы при threadsCount потоках

        float[][] m = new float[threadsCount][h];   //массив для удобства деления на потоки
        Thread[] t = new Thread[threadsCount];      //создаём массив потоков для обработки одномерных массивов в двумерном массиве m

        for (int i = 0; i < threadsCount; i++) {
            System.arraycopy(arr,h * i,m[i],0,h);
            final int u = i;            //индекс массива
            t[i] = new Thread(()->{
                long a = System.currentTimeMillis();    //засекаем время выполнения потока
                int z = u * h;          //смещение индекса массива
                for (int j = 0; j < h; j++, z++) {
                    m[u][j] = (float)(m[u][j] * Math.sin(0.2f + z / 5) * Math.cos(0.2f * z / 5) * Math.cos(0.4f * z / 2));
                }
                System.out.println("На работу " + u + " потока было затрчено " + (System.currentTimeMillis() - a) + " ms."); //выводим время выполнения потока
            });
            t[i].start();       //запустили поток
        }

        try{
            for (int i = 0; i < threadsCount; i++) {
                t[i].join();    //main ожидает завершения потока
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 0; i < threadsCount; i++) {
            System.arraycopy(m[i],0,arr,i*h,h);
        }
        System.out.println("На работу программы при использовании " + threadsCount + " потокав было затрчено " + (System.currentTimeMillis() - b) + " ms."); //выводим время выполнения программы при определенном количестве потоков
    }
}
