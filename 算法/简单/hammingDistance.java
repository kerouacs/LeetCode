//^是异或运算符，异或的规则是转换成二进制比较，相同为0，不同为1.
//＆同为１时为１，否则为０
//｜同为０时为０，否则为１
// >>:右移运算符，num >> 1,相当于num除以2
class hammingDistance {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        int count = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                count++;
            }
            i = i >> 1;
        }
        return count;
    }
}
