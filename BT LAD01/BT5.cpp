#include <iostream>
using namespace std;

// 1) Nh?p m?ng d?ng
void nhapMang(int* &a, int &n) {
    cout << "Nhap so phan tu n = ";
    cin >> n;
    a = new int[n];
    for(int i = 0; i < n; i++) {
        cout << "a[" << i << "] = ";
        cin >> a[i];
    }
}

// 2) Xu?t m?ng
void xuatMang(int *a, int n) {
    cout << "Mang: ";
    for(int i = 0; i < n; i++)
        cout << a[i] << " ";
    cout << endl;
}

// 3) Tìm ph?n t? nh? nh?t
int timMin(int *a, int n) {
    int min = a[0];
    for(int i = 1; i < n; i++)
        if(a[i] < min) min = a[i];
    return min;
}

// 4) Tính t?ng ph?n t?
int tongMang(int *a, int n) {
    int s = 0;
    for(int i = 0; i < n; i++)
        s += a[i];
    return s;
}

// 5) Xóa ph?n t? t?i v? trí k
void xoaTaiViTri(int* &a, int &n, int k) {
    if(k < 0 || k >= n) return;
    for(int i = k; i < n-1; i++)
        a[i] = a[i+1];
    n--;
}

// 6) Thêm ph?n t? x sau v? trí k
void themSauViTriK(int* &a, int &n, int k, int x) {
    if(k < 0 || k >= n) return;
    int *b = new int[n+1];
    for(int i = 0; i <= k; i++)
        b[i] = a[i];
    b[k+1] = x;
    for(int i = k+1; i < n; i++)
        b[i+1] = a[i];
    n++;
    delete[] a;
    a = b;
}

// 7) S?p x?p gi?m d?n
void sapXepGiamDan(int *a, int n) {
    for(int i = 0; i < n-1; i++)
        for(int j = i+1; j < n; j++)
            if(a[i] < a[j])
                swap(a[i], a[j]);
}

// 8) Xóa các ph?n t? có giá tr? l?n nh?t
void xoaGiaTriMax(int* &a, int &n) {
    int max = a[0];
    for(int i = 1; i < n; i++)
        if(a[i] > max) max = a[i];

    for(int i = 0; i < n; ) {
        if(a[i] == max)
            xoaTaiViTri(a, n, i);
        else
            i++;
    }
}

// ================= MAIN =================
int main() {
    int *a, n;
    nhapMang(a, n);
    xuatMang(a, n);

    cout << "Min = " << timMin(a, n) << endl;
    cout << "Tong = " << tongMang(a, n) << endl;

    int k, x;
    cout << "Nhap vi tri k can xoa: ";
    cin >> k;
    xoaTaiViTri(a, n, k);
    xuatMang(a, n);

    cout << "Nhap k va x de them x sau k: ";
    cin >> k >> x;
    themSauViTriK(a, n, k, x);
    xuatMang(a, n);

    sapXepGiamDan(a, n);
    cout << "Mang sau khi sap xep giam dan:\n";
    xuatMang(a, n);

    xoaGiaTriMax(a, n);
    cout << "Mang sau khi xoa gia tri lon nhat:\n";
    xuatMang(a, n);

    delete[] a; // gi?i phóng b? nh?
    system("pause");
    return 0;
}

