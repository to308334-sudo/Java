#include <iostream>
#include <string>
#include <cctype>
#include <sstream>
using namespace std;

// 1) Ð?m ch? cái
int demChuCai(const string &s) {
    int dem = 0;
    for(char c : s)
        if(isalpha(c)) dem++;
    return dem;
}

// 2) Ð?m ch? s?
int demChuSo(const string &s) {
    int dem = 0;
    for(char c : s)
        if(isdigit(c)) dem++;
    return dem;
}

// 3) Chèn '@' tru?c "gmail.com"
string chenAtTruocGmail(string s) {
    string key = "gmail.com";
    int pos = s.find(key);
    if(pos != string::npos)
        s.insert(pos, "@");
    return s;
}

// 4) Chèn '-' gi?a hai s? ch?n liên ti?p
string chenGachGiuaSoChan(string s) {
    string kq = "";
    for(int i = 0; i < s.length(); i++) {
        kq += s[i];
        if(isdigit(s[i]) && isdigit(s[i+1])) {
            int a = s[i] - '0';
            int b = s[i+1] - '0';
            if(a % 2 == 0 && b % 2 == 0)
                kq += '-';
        }
    }
    return kq;
}

// 5) Thay "gmail.com" ? "ctech.edu.vn"
string thayGmail(string s) {
    string key = "gmail.com";
    int pos = s.find(key);
    if(pos != string::npos)
        s.replace(pos, key.length(), "ctech.edu.vn");
    return s;
}

// 6) Ðua ra các t? trong xâu
void inCacTu(const string &s) {
    stringstream ss(s);
    string word;
    cout << "Cac tu trong xau:\n";
    while(ss >> word)
        cout << word << endl;
}

// 7) Ð?i hoa ? thu?ng
string doiHoaThuong(string s) {
    for(int i = 0; i < s.length(); i++) {
        if(islower(s[i])) s[i] = toupper(s[i]);
        else if(isupper(s[i])) s[i] = tolower(s[i]);
    }
    return s;
}

// 8) Tìm ch? s? và tính t?ng
int tongChuSo(const string &s) {
    int tong = 0;
    for(char c : s)
        if(isdigit(c))
            tong += c - '0';
    return tong;
}

// 9) Vi?t hoa ch? cái d?u m?i t?
string vietHoaDauTu(string s) {
    bool dauTu = true;
    for(int i = 0; i < s.length(); i++) {
        if(isalpha(s[i]) && dauTu) {
            s[i] = toupper(s[i]);
            dauTu = false;
        }
        else if(s[i] == ' ')
            dauTu = true;
    }
    return s;
}

// 10) Ð?o ngu?c xâu
string daoNguoc(string s) {
    int l = 0, r = s.length()-1;
    while(l < r) {
        swap(s[l], s[r]);
        l++; r--;
    }
    return s;
}

// 11) Tìm t? dài nh?t
string tuDaiNhat(const string &s) {
    stringstream ss(s);
    string word, maxWord;
    while(ss >> word) {
        if(word.length() > maxWord.length())
            maxWord = word;
    }
    return maxWord;
}

// ================= MAIN =================
int main() {
    string s;
    cout << "Nhap xau: ";
    getline(cin, s);

    cout << "So chu cai: " << demChuCai(s) << endl;
    cout << "So chu so: " << demChuSo(s) << endl;

    cout << "Chen @ truoc gmail: " << chenAtTruocGmail(s) << endl;
    cout << "Chen '-' giua so chan: " << chenGachGiuaSoChan(s) << endl;

    cout << "Thay gmail.com: " << thayGmail(s) << endl;

    inCacTu(s);

    cout << "Doi hoa-thuong: " << doiHoaThuong(s) << endl;
    cout << "Tong cac chu so: " << tongChuSo(s) << endl;
    cout << "Viet hoa dau tu: " << vietHoaDauTu(s) << endl;
    cout << "Dao nguoc xau: " << daoNguoc(s) << endl;
    cout << "Tu dai nhat: " << tuDaiNhat(s) << endl;

    system("pause");
    return 0;
}

