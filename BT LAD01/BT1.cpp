#include <iostream>
#include <cmath>
using namespace std;

// 1) S = 1 + 1/2 + 1/3 + ... + 1/n
double tong1(int n) {
    double s = 0;
    for(int i = 1; i <= n; i++) {
        s += 1.0 / i;
    }
    return s;
}

// 2) S = 1/2 + 1/4 + ... + 1/(2n)
double tong2(int n) {
    double s = 0;
    for(int i = 1; i <= n; i++) {
        s += 1.0 / (2 * i);
    }
    return s;
}

// 3) S = 1 + 3 + 5 + ... + (2n+1)
int tong3(int n) {
    int s = 0;
    for(int i = 0; i <= n; i++) {
        s += 2*i + 1;
    }
    return s;
}

// 4) S = 1 + x + x^2 + ... + x^n
double tong4(double x, int n) {
    double s = 0;
    for(int i = 0; i <= n; i++) {
        s += pow(x, i);
    }
    return s;
}

// Hàm tính giai th?a
long long giaithua(int n) {
    long long f = 1;
    for(int i = 1; i <= n; i++) {
        f *= i;
    }
    return f;
}

// 5) S = 1 - x^2/2! + x^4/4! - ... + (-1)^n * x^(2n)/(2n)!
double tong5(double x, int n) {
    double s = 0;
    for(int i = 0; i <= n; i++) {
        double tu = pow(-1, i) * pow(x, 2*i);
        double mau = giaithua(2*i);
        s += tu / mau;
    }
    return s;
}

// 6) S = 1 + x/1! + x^2/2! + ... + x^n/n!
double tong6(double x, int n) {
    double s = 0;
    for(int i = 0; i <= n; i++) {
        s += pow(x, i) / giaithua(i);
    }
    return s;
}

// ================= MAIN =================
int main() {
    int n;
    double x;
    
    cout << "Nhap n = ";
    cin >> n;
    cout << "Nhap x = ";
    cin >> x;
    
    cout << "Tong 1 = " << tong1(n) << endl;
    cout << "Tong 2 = " << tong2(n) << endl;
    cout << "Tong 3 = " << tong3(n) << endl;
    cout << "Tong 4 = " << tong4(x, n) << endl;
    cout << "Tong 5 = " << tong5(x, n) << endl;
    cout << "Tong 6 = " << tong6(x, n) << endl;

    return 0;
}

