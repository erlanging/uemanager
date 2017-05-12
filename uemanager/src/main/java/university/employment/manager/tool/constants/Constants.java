package university.employment.manager.tool.constants;

public interface Constants {

	// 公有属性------开始
	//验证码有效期(秒)
	public static final int EXPIRESECONDS = 300;
	// 客户问津服务器地址
	public static final String BASEUSERSERVICEURL = "http://127.0.0.1";
	// 文件编码格式
	public final static String ENCODE = "UTF-8";
	// 空字符串
	public final static String STR = "";
	// 空字符串
	public final static String STRNULL = String.valueOf("null");
	// .英文句号
	public final static String DOT = ".";
	// ,英文逗号
	public final static String COMMA = ",";
	// 英文分号;
	public final static String SEMICOLON = ";";
	// _英文下划线
	public final static String BAR = "-";
	// /英文路径符号
	public final static String BAT = "/";
	public final static String AT = "@";
	// 数字0
	public final static int ZERO = 0;
	// 数字1
	public final static int ONE = 1;
	// 用户登录名
	public final static String LOGINNAME = "loginname";
	// 用户id
	public final static String USER_ID = "user_id";
	// 操作类型
	public final static String TYPE = "type";
	// 用户密码
	public final static String PASSWD = "passwd";
	// rsa加密字段
	public final static String RSA = "rsa";
	// 用户ip
	public final static String IP = "ip";
	public final static String UUID = "uuid";
	// 用户GPS信息
	public final static String LATITUDE = "latitude";// 纬度
	public final static String LONGITUDE = "longitude";// 经度
	public final static int PERICITION = 10;// GPS精度
	// 全局常量
	public final static String ID = "id";
	public final static String CREATETIME = "createTime";
	public final static String HASDELETE = "hasDelete";
	public final static String PAGE = "page";
	public final static int PAGENUMBER = 5;
	public final static String SEARCHCONTENT = "searchcontent";
	// token
	public final static String TOKEN = "token";
	// 过期时间戳
	public final static String EXPIRE = "expire";
	// token失效天数为7天
	public final static int FAILUREDAYS = 7;
	// token失效秒数
	public final static int FAILUREMILLS = 604800;
	// 注册中的常量
	public final static String PHONE = "phone";// 注册手机号
	public final static String MAIL = "mail";// 注册邮箱
	public final static String STUTAS = "status";// 用户状态
	public final static String IDENTIFY = "identify";// 注册下发到手机的验证码
	// 第三方登陆的常量
	public final static String THIRDUID = "thirduid";
	public final static String PIDTYPE = "pidtype";
	// response中用到的常量
	public static final String CODE = "code";
	public static final String MSG = "msg";
	public static final String DATA = "data";
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	// 无需该操作
	public final static String NEEDLESS = "needless";
	public final static String FIRSTTHIRDLOGIN = "firstthirdlogin";
	public final static String FALSE = "false";
	public final static String TRUE = "true";

	public static final String NAME = "name";
	public static final String ACCESS = "access";
	public static final int USERSETTIME = 300;

	public final static String SYSTABLE = "trsapp";
	//发送手机邮箱随机验证码
	public static class IDENTIFYTYPE {
		public final static String REGISTER = "register";
		public final static String UPDATE = "update";
	}
	public final static String DEFAULT_ROW_SIZE = "10";
	public static final String ERROR_PAGE = "";
	public static final boolean AUTH_ON = false;
	//加密字段
	public static final String encryptfild = "encryptfild";
	
	public static class Status {
		public static final int NORMALSTATUS = 0; // 正常
		public static final int STOPSTATUS = 1; // 停用
		public static final int DELETESTATUS = 2; // 删除
	}


	public static class LoginStatus {
		public static final byte LOGIN = 0; // 登陆
		public static final byte LOGOUT = 1; // 登出
	}

}
