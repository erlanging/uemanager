/** 
 * 检查字符串是否为合法QQ号码 
 * @param {String} 字符串 
 * @return {bool} 是否为合法QQ号码 
 */
function isQQ(aQQ) {
	var bValidate = RegExp(/^[1-9][0-9]{4,9}$/).test(aQQ);
	if (bValidate) {
		return true;
	} else
		return false;
}
/** 
 * 检查字符串是否为合法手机号码 
 * @param {String} 字符串 
 * @return {bool} 是否为合法手机号码 
 */
function isPhone(aPhone) {
	var bValidate = RegExp(
			/^(0|86|17951)?(13[0-9]|15[012356789]|18[0-9]|14[57])[0-9]{8}$/)
			.test(aPhone);
	if (bValidate) {
		return true;
	} else
		return false;
}
/** 
 * 检查字符串是否为合法email地址 
 * @param {String} 字符串 
 * @return {bool} 是否为合法email地址 
 */
function isEmail(aEmail) {
	var bValidate = RegExp(
			/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/)
			.test(aEmail);
	if (bValidate) {
		return true;
	} else
		return false;
}
/** 
 * 检查字符串是否是整数 
 * @param {String} 字符串 
 * @return {bool} 是否是整数 
 */
function isInteger(s) {
	var isInteger = RegExp(/^[0-9]+$/);
	return (isInteger.test(s));
}
/* 
    判断字符类型 
 */
function CharMode(iN) {
	if (iN >= 48 && iN <= 57) //数字    
		return 1;
	if (iN >= 65 && iN <= 90) //大写字母    
		return 2;
	if (iN >= 97 && iN <= 122) //小写    
		return 4;
	else
		return 8; //特殊字符    
}
/* 
    统计字符类型 
 */
function bitTotal(num) {
	modes = 0;
	for (i = 0; i < 4; i++) {
		if (num & 1)
			modes++;
		num >>>= 1;
	}
	return modes;
}
/* 
    返回密码的强度级别 
 */
function checkStrong(sPW) {
	if (sPW.length <= 4)
		return 0; //密码太短    
	Modes = 0;
	for (i = 0; i < sPW.length; i++) {
		//测试每一个字符的类别并统计一共有多少种模式.    
		Modes |= CharMode(sPW.charCodeAt(i));
	}
	return bitTotal(Modes);
}