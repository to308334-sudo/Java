#include <iostream>
#include <cmath>
using namespace std;

#define MAX 50

// ===== 1) Nh?p ma tr?n vuông c?p n =====
void nhapMaTran(int a[][MAX], int &n) {
    cout << "Nhap cap ma tran vuong n = ";
    cin >> n;
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++) {
            cout << "a[" << i << "][" << j << "] = ";
            cin >> a[i][j];
        }
}

// ===== 2) In ma tr?n =====
void inMaTran(int a[][MAX], int n) {
    cout << "Ma tran:\n";
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++)
            cout << a[i][j] << "\t";
        cout << endl;
    }
}

// ===== 3) T?ng ph?n t? ma tr?n =====
int tongMaTran(int a[][MAX], int n) {
    int s = 0;
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            s += a[i][j];
    return s;
}

// ===== 4) Ph?n t? l?n nh?t hàng k =====
int maxHangK(int a[][MAX], int n, int k) {
    int max = a[k][0];
    for(int j = 1; j < n; j++)
        if(a[k][j] > max) max = a[k][j];
    return max;
}

// ===== 5) Ð?m s? âm c?t k =====
int demSoAmCotK(int a[][MAX], int n, int k) {
    int dem = 0;
    for(int i = 0; i < n; i++)
        if(a[i][k] < 0) dem++;
    return dem;
}

// ===== Hàm ki?m tra s? chính phuong =====
bool laSoChinhPhuong(int x) {
    if(x < 0) return false;
    int t = sqrt(x);
    return t * t == x;
}

// ===== 6) In s? chính phuong trên du?ng chéo chính =====
void soChinhPhuongCheoChinh(int a[][MAX], int n) {
    cout << "So chinh phuong tren duong cheo chinh: ";
    for(int i = 0; i < n; i++)
        if(laSoChinhPhuong(a[i][i]))
            cout << a[i][i] << " ";
    cout << endl;
}

// ===== Hàm ki?m tra u?c c?a 150 =====
bool laUoc150(int x) {
    if(x == 0) return false;
    return 150 % x == 0;
}

// ===== 7) Trung bình c?ng các u?c c?a 150 trên du?ng chéo ph? =====
double TBC_Uoc150_CheoPhu(int a[][MAX], int n) {
    int tong = 0, dem = 0;
    for(int i = 0; i < n; i++) {
        int j = n - 1 - i; // v? trí du?ng chéo ph?
        if(laUoc150(a[i][j])) {
            tong += a[i][j];
            dem++;
        }
    }
    if(dem == 0) return 0;
    return (double)tong / dem;
}

// ===== 8) S?p x?p gi?m d?n t?ng hàng =====
void sapXepGiamDanTungHang(int a[][MAX], int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n-1; j++) {
            for(int k = j+1; k < n; k++) {
                if(a[i][j] < a[i][k]) {
                    int temp = a[i][j];
                    a[i][j] = a[i][k];
                    a[i][k] = temp;
                }
            }
        }
    }
}

// =============== MAIN ===============
int main() {
    int a[MAX][MAX], n, k;

    nhapMaTran(a, n);
    inMaTran(a, n);

    cout << "Tong ma tran = " << tongMaTran(a, n) << endl;

    cout << "Nhap hang k can tim max (0 -> " << n-1 << "): ";
    cin >> k;
    cout << "Max hang " << k << " = " << maxHangK(a, n, k) << endl;

    cout << "Nhap cot k can dem so am (0 -> " << n-1 << "): ";
    cin >> k;
    cout << "So am cot " << k << " = " << demSoAmCotK(a, n, k) << endl;

    soChinhPhuongCheoChinh(a, n);

    cout << "TBC cac uoc cua 150 tren cheo phu = " << TBC_Uoc150_CheoPhu(a, n) << endl;

    sapXepGiamDanTungHang(a, n);
    cout << "Ma tran sau khi sap xep giam dan tung hang:\n";
    inMaTran(a, n);

    system("pause");
    return 0;
}

