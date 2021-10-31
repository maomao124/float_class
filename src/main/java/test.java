/**
 * Project name(项目名称)：Float类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 20:08
 * Version(版本): 1.0
 * Description(描述)：
 * Float 类的构造方法
 * Float 类中的构造方法有以下 3 个。
 * Float(double value)：构造一个新分配的 Float 对象，它表示转换为 float 类型的参数。
 * Float(float value)：构造一个新分配的 Float 对象，它表示基本的 float 参数。
 * Float(String s)：构造一个新分配的 Float 对象，它表示 String 参数所指示的 float 值。
 * Float类中的常用方法
 * 方法	          返回值	     功能
 * byteValue()	byte	以 byte 类型返回该 Float 的值
 * doubleValue()	double	以 double 类型返回该 Float 的值
 * floatValue()	float	以 float 类型返回该 Float 的值
 * intValue()	int	以 int 类型返回该 Float 的值（强制转换为 int 类型）
 * longValue()	long	以 long 类型返回该 Float 的值（强制转换为 long 类型）
 * shortValue()	short	以 short 类型返回该 Float 的值（强制转换为 short 类型）
 * isNaN()	boolean	如果此 Float 值是一个非数字值，则返回 true，否则返回 false
 * isNaN(float v)	boolean	如果指定的参数是一个非数字值，则返回 true，否则返回 false
 * toString()	String	返回一个表示该 Float 值的 String 对象
 * valueOf(String s)	Float	返回保存指定的 String 值的 Float 对象
 * parseFloat(String s)	float	将数字字符串转换为 float 数值
 * Float 类的常用常量
 * 在 Float 类中包含了很多常量，其中较为常用的常量如下。
 * MAX_VALUE：值为 1.4E38 的常量，它表示 float 类型能够表示的最大值。
 * MIN_VALUE：值为 3.4E-45 的常量，它表示 float 类型能够表示的最小值。
 * MAX_EXPONENT:有限 float 变量可能具有的最大指数。
 * MIN_EXPONENT：标准化 float 变量可能具有的最小指数。
 * MIN_NORMAL：保存 float 类型数值的最小标准值的常量，即 2-126。
 * NaN：保存 float 类型的非数字值的常量。
 * SIZE：用来以二进制补码形式表示 float 值的比特位数。
 * TYPE：表示基本类型 float 的 Class 实例。
 */

public class test
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        double data = 2.3657896456;
        Float f1 = new Float(data);
        System.out.println(f1);
        Float f2 = 258.364f;
        System.out.println(f2);
        Float f3 = new Float("369.57");
        System.out.println(f3);
        float f4 = new Float("355.24559874565");
        System.out.println(f4);
        float f5 = Float.valueOf("654.36");
        System.out.println(f5);
        float f6 = Float.parseFloat("69.24");
        System.out.println(f6);
        String str1 = Float.toString(f6);
        System.out.println(str1);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.print("float类型的最小正法线值:");
        System.out.println(Float.MIN_NORMAL);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
