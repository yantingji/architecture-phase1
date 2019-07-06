/*【练习题01】类的成员变量
猜数字游戏一个类A有一个成员变量v有一个初值100。定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
【练习题02】类的成员变量
请定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)体积(size)等等方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等. 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变。
【练习题03】类的成员变量与方法、构造方法
在程序中经常要对时间进行操作但是并没有时间类型的数据。那么我们可以自己实现一个时间类来满足程序中的需要。定义名为MyTime的类其中应有三个整型成员时hour分minute秒second为了保证数据的安全性这三个成员变量应声明为私有。为MyTime类定义构造方法以方便创建对象时初始化成员变量。再定义diaplay方法用于将时间信息打印出来。为MyTime类添加以下方法addSecond(int sec) addMinute(int min) addHour(inthou) subSecond(int sec) subMinute(int min) subHour(inthou) 分别对时、分、秒进行加减运算。
【练习题04】构造方法
编写Java程序模拟简单的计算器。定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。在main方法中创建Number类的对象调用各个方法并显示计算结果。
【练习题05】构造方法
编写Java程序用于显示人的姓名和年龄。定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。在main方法中创建人类的实例然后将信息显示。
【练习题06】get方法和set方法
定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法提示假设有private String name;则有public void setName(String name){ this.name = name; } public String getName(){ return this.name; }
【练习题07】构造方法与重载
为“无名的粉”写一个类class WuMingFen要求：
1.有三个属性面码:String theMa粉的分量(两) int quantity 是否带汤booleanlikeSoup
2.写一个构造方法以便于简化初始化过程如WuMingFen f1 = new WuMingFen(“牛肉”,3,true);
3.重载构造方法使得初始化过程可以多样化WuMingFen f2 = new WuMingFen(“牛肉”,2);
4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的WuMingFen f3 = new WuMingFen();
5.写一个普通方法 check() 用于查看粉是否符合要求。即将对象的三个属性打印在控制台上。
【练习题08】构造方法的重载
定义一个名为Vehicles 交通工具的基类该类中应包含String类型的成员属性brand 商标和color 颜色还应包含成员方法run 行驶在控制台显示“我已经开动了”和showInfo显示信息在控制台显示商标和颜色并编写构造方法初始化其成员属性。编写Car 小汽车类继承于Vehicles类增加int型成员属性seats 座位还应增加成员方法showCar在控制台显示小汽车的信息并编写构造方法。编写Truck 卡车类继承于Vehicles类增加float型成员属性load 载重还应增加成员方法showTruck在控制台显示卡车的信息并编写构造方法。在main方法中测试以上各类。
【练习题09】构造方法与重载
定义一个网络用户类要处理的信息有用户ID、用户密码、email地址。在建立类的实例时把以上三个信息都作为构造函数的参数输入其中用户ID和用户密码时必须的缺省的email地址是用户ID加上字符串“yantingji@itedu.com”
【练习题10】构造方法与重载、包
编写Addition类该类中应包含一组实现两数相加运算的重载方法。实现加法运算的方法应接受两个参数即加数和被加数方法将两个参数进行加法运算后返回相加结果。考虑可能针对不同的数据类型进行计算重载一组方法包括整型、长整型、浮点型、双精度浮点型、还有字符串。在main方法中创建Addition类的实例分别调用重载方法测试其效果。应将Addition类打入到包中以自己名字的拼音为包命名。
【练习题11】构造方法与重载
将上次练习题三中编写的MyTime类打到以自己名字的拼音命名的包中并为该类重载一组构造方法以方便使用者能够以多种形式初始化该类的实例。
【练习题12】构造方法与重载
建立一个汽车类包括轮胎个数汽车颜色车身重量等属性。并通过不同的构造方法创建事例。至少要求汽车能够加速减速停车。要求命名规范代码体现层次有友好的操作提示。
【练习题13】构造方法与重载
创建一个类为该类定义三个构造函数分别执行下列操作
1、传递两个整数值并找出其中较大的一个值
2、传递三个double值并求出其乘积
3、传递两个字符串值并检查其是否相同
4、在main方法中测试构造函数的调用
【练习题14】Static关键字与普通变量的区别
创建一个名称为StaticDemo的类并声明一个静态变量和一个普通变量。对变量分别赋予10和5的初始值。在main()方法中输出变量值。
【练习题15】继承
创建一个名称为MainPackage的包使它包含MainClass和MainSubClass类。MainClass类应当包含变量声明其值从构造函数中输出。MainSubClass类从MainClass派生而来。试执行下列操作创建一个名称为SamePackage的类使它导入上述包并创建一个MainSubClass类的对象。
【练习16】包、继承、构造函数
创建一个名称为MainPackage的包使它包含MainClass和MainSubClass类。MainClass类应当包含变量声明其值从构造方法中输出。MainSubClass类从MainClass派生而来。试执行下列操作创建一个名称为SamePackage的类使它导入上述包并创建一个MainSubClass类的对象。
【练习题17】继承
创建一个父类和子类父类有一个数据成员子类继承父类的该数据成员通过构造函数初始化并显示该数据成员的值。
【练习题18】覆盖、继承
建立一个汽车Auto类包括轮胎个数汽车颜色车身重量、速度等成员变量。并通过不同的构造方法创建实例。至少要求汽车能够加速减速停车。再定义一个小汽车类Car 继承Auto 并添加空调、CD等成员变量覆盖加速减速的方法
【练习题19】抽象类与继承
设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。使用继承将这些图形分类找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化) 并看看这些图形是否能进一步划分为子类。本题只考虑实现思想不考虑具体实现的细节实现方式可自由发挥。
【练习题20】抽象类
创建一个Vehicle类并将它声明为抽象类。在Vehicle类中声明一个NoOfWheels方法使它返回一个字符串值。创建两个类Car和Motorbike从Vehicle类继承并在这两个类中实现NoOfWheels方法。在Car类中应当显示“四轮车”信息而在Motorbike类中应当显示“双轮车”信息。创建另一个带main方法的类在该类中创建Car和Motorbike的实例并在控制台中显示消息。
【练习题21】抽象类
创建一个Vehicle类并将它声明为抽象类。在Vehicle类中声明一个NoOfWheels方法使它返回一个字符串值。创建两个类Car和Motorbike从Vehicle类继承并在这两个类中实现NoOfWheels方法。在Car类中应当显示“四轮车”信息而在Motorbike类中应当显示“双轮车”信息。创建另一个带main方法的类在该类中创建Car和Motorbike的实例并在控制台中显示消息。
【练习题22】接口
创建一个名称为Vehicle的接口在接口中添加两个带有一个参数的方法start()和stop()。在两个名称分别为Bike和Bus的类中实现Vehicle接口。创建一个名称为interfaceDemo的类在interfaceDemo的main()方法中创建Bike和Bus对象并访问start()和stop()方法。
【练习题25】抽象类、继承、接口综合
设计一个系统  xxx饮料生产线目前流程是从某个地方把水取出来然后经过缓冲过滤放微量元素的步骤 abstract 水{  public void 水(); } interface 过滤{} interface 缓冲{} interface 微量元素{} ,interface 果汁。class苹果汁 extends 水 imps 各种接口；草莓汁 extends 水 imps 各种接口。
【练习题26】综合题公司员工
定义一个抽象的"Role"类有姓名年龄性别等成员变量
 1. 要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有) 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法该方法不返回任何值同时至少定义两个构造方法。Role类中要体现出this的几种用法。
2. 从Role类派生出一个"Employee"类该类具有Role类的所有成员构造方法除外并扩展 salary成员变量同时增加一个静态成员变量“职工编号 ID ”。同样要有至少两个构造方法要体现出this和super的几种用法还要求覆盖play()方法并提供一个final sing()方法。
3. "Manager"类继承"Employee"类有一个final成员变量"vehicle"
4. 在main()方法中制造Manager和Employee对象,并测试这些对象的方法
【练习题27】综合题二品尝饮料
 1、使用命令行参数饮料类型输出该饮料类型的味道如：当命令行参数为“1”时，结果为橘子汁；为“2 ”时，结果为苹果汁，为“3”时，报DrinkNotFoundException异常。
2、请注意多态性的运用。
*/

package junior.season4;