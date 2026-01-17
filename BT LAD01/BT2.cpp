#include <iostream>
#include <cmath>
using namespace std;

#define MAX 100

// 1) Nh?p m?ng
void nhapMang(int a[], int &n) {
    cout << "Nhap so phan tu n = ";
    cin >> n;
    for(int i = 0; i < n; i++) {
        cout << "a[" << i << "] = ";
        cin >> a[i];
    }
}

// 2) Xu?t m?ng
void xuatMang(int a[], int n) {
    cout << "Mang: ";
    for(int i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;
}

// 3) Tính t?ng ph?n t? m?ng
int tongMang(int a[], int n) {
    int s = 0;
    for(int i = 0; i < n; i++)
        s += a[i];
    return s;
}

// 4) Ð?m s? âm
int demSoAm(int a[], int n) {
    int dem = 0;
    for(int i = 0; i < n; i++)
        if(a[i] < 0) dem++;
    return dem;
}

// 5) Ki?m tra s? chính phuong
bool laSoChinhPhuong(int x) {
    if(x < 0) return false;
    int k = sqrt(x);
    return k * k == x;
}

// 6) Tính trung bình c?ng các s? chính phuong
double trungBinhSoChinhPhuong(int a[], int n) {
    int tong = 0, dem = 0;
    for(int i = 0; i < n; i++) {
        if(laSoChinhPhuong(a[i])) {
            tong += a[i];
            dem++;
        }
    }
    if(dem == 0) return 0;
    return (double)tong / dem;
}

// 7) In các s? chính phuong
void inSoChinhPhuong(int a[], int n) {
    cout << "Cac so chinh phuong: ";
    for(int i = 0; i < n; i++)
        if(laSoChinhPhuong(a[i]))
            cout << a[i] << " ";
    cout << endl;
}

// 8) Tìm max
int timMax(int a[], int n) {
    int max = a[0];
    for(int i = 1; i < n; i++)
        if(a[i] > max) max = a[i];
    return max;
}

// 9) Tìm min
int timMin(int a[], int n) {
    int min = a[0];
    for(int i = 1; i < n; i++)
        if(a[i] < min) min = a[i];
    return min;
}

// 10) In các s? trong kho?ng (min, max)
void inTrongKhoang(int a[], int n, int min, int max) {
    cout << "Cac so trong khoang (" << min << ", " << max << "): ";
    for(int i = 0; i < n; i++)
        if(a[i] > min && a[i] < max)
            cout << a[i] << " ";
    cout << endl;
}

// ================= MAIN =================
int main() {
    int a[MAX], n;

    nhapMang(a, n);
    xuatMang(a, n);

    cout << "Tong mang = " << tongMang(a, n) << endl;
    cout << "So luong so am = " << demSoAm(a, n) << endl;

    inSoChinhPhuong(a, n);
    cout << "Trung binh so chinh phuong = " << trungBinhSoChinhPhuong(a, n) << endl;

    int max = timMax(a, n);
    int min = timMin(a, n);

    cout << "Max = " << max << endl;
    cout << "Min = " << min << endl;

    inTrongKhoang(a, n, min, max);

    system("pause");
    return 0;
}

