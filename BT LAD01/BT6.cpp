#include <iostream>
#include <string>
using namespace std;

struct Sinhvien {
    string MaSV;
    string Hoten;
    string Lop;
    float Diem;
};

// ===== a) Nh?p danh sách sinh viên =====
void nhapDanhSach(Sinhvien* &ds, int &n) {
    cout << "Nhap so sinh vien: ";
    cin >> n;
    cin.ignore();
    ds = new Sinhvien[n];
    for(int i = 0; i < n; i++) {
        cout << "\nSinh vien thu " << i << endl;
        cout << "MaSV: "; getline(cin, ds[i].MaSV);
        cout << "Ho ten: "; getline(cin, ds[i].Hoten);
        cout << "Lop: "; getline(cin, ds[i].Lop);
        cout << "Diem: "; cin >> ds[i].Diem;
        cin.ignore();
    }
}

// ===== b) Hi?n th? danh sách =====
void hienThi(Sinhvien *ds, int n) {
    cout << "\n===== DANH SACH SINH VIEN =====\n";
    for(int i = 0; i < n; i++) {
        cout << i << " | " << ds[i].MaSV << " | " << ds[i].Hoten 
             << " | " << ds[i].Lop << " | " << ds[i].Diem << endl;
    }
}

// ===== c) Hi?n th? sinh viên theo l?p =====
void hienThiTheoLop(Sinhvien *ds, int n, string lop) {
    cout << "\nSinh vien lop " << lop << ":\n";
    for(int i = 0; i < n; i++)
        if(ds[i].Lop == lop)
            cout << ds[i].MaSV << " | " << ds[i].Hoten << " | " << ds[i].Diem << endl;
}

// ===== d) Sinh viên l?p k có di?m >5 =====
void hienThiLopDiemLonHon5(Sinhvien *ds, int n, string lop) {
    cout << "\nSinh vien lop " << lop << " co diem >5:\n";
    for(int i = 0; i < n; i++)
        if(ds[i].Lop == lop && ds[i].Diem > 5)
            cout << ds[i].MaSV << " | " << ds[i].Hoten << " | " << ds[i].Diem << endl;
}

// ===== e) Sinh viên có di?m l?n nh?t =====
void sinhVienMax(Sinhvien *ds, int n) {
    float max = ds[0].Diem;
    for(int i = 1; i < n; i++)
        if(ds[i].Diem > max) max = ds[i].Diem;

    cout << "\nSinh vien co diem lon nhat (" << max << "):\n";
    for(int i = 0; i < n; i++)
        if(ds[i].Diem == max)
            cout << ds[i].MaSV << " | " << ds[i].Hoten << endl;
}

// ===== f) Thêm sinh viên cu?i danh sách =====
void themCuoi(Sinhvien* &ds, int &n, Sinhvien sv) {
    Sinhvien *temp = new Sinhvien[n+1];
    for(int i = 0; i < n; i++)
        temp[i] = ds[i];
    temp[n] = sv;
    n++;
    delete[] ds;
    ds = temp;
}

// ===== g) Thêm sinh viên sau v? trí k =====
void themSauK(Sinhvien* &ds, int &n, Sinhvien sv, int k) {
    if(k < 0 || k >= n) return;
    Sinhvien *temp = new Sinhvien[n+1];
    for(int i = 0; i <= k; i++)
        temp[i] = ds[i];
    temp[k+1] = sv;
    for(int i = k+1; i < n; i++)
        temp[i+1] = ds[i];
    n++;
    delete[] ds;
    ds = temp;
}

// ===== h) Xóa sinh viên v? trí k =====
void xoaTaiK(Sinhvien* &ds, int &n, int k) {
    if(k < 0 || k >= n) return;
    for(int i = k; i < n-1; i++)
        ds[i] = ds[i+1];
    n--;
}

// ===== k) S?p x?p gi?m d?n theo di?m =====
void sapXepGiamTheoDiem(Sinhvien *ds, int n) {
    for(int i = 0; i < n-1; i++)
        for(int j = i+1; j < n; j++)
            if(ds[i].Diem < ds[j].Diem)
                swap(ds[i], ds[j]);
}

// ===== l) Chuy?n l?p theo mã sinh viên =====
void chuyenLop(Sinhvien *ds, int n, string ma, string lopMoi) {
    for(int i = 0; i < n; i++)
        if(ds[i].MaSV == ma)
            ds[i].Lop = lopMoi;
}

// ===== n) Sinh viên di?m cao nh?t c?a l?p =====
void maxTheoLop(Sinhvien *ds, int n, string lop) {
    float max = -1;
    for(int i = 0; i < n; i++)
        if(ds[i].Lop == lop && ds[i].Diem > max)
            max = ds[i].Diem;

    cout << "\nSinh vien lop " << lop << " co diem cao nhat:\n";
    for(int i = 0; i < n; i++)
        if(ds[i].Lop == lop && ds[i].Diem == max)
            cout << ds[i].MaSV << " | " << ds[i].Hoten << " | " << ds[i].Diem << endl;
}

// ===== o) Xóa sinh viên cu?i =====
void xoaCuoi(Sinhvien* &ds, int &n) {
    if(n > 0) n--;
}

// ================= MAIN =================
int main() {
    Sinhvien *ds;
    int n;
    nhapDanhSach(ds, n);
    hienThi(ds, n);

    string lop, ma;
    int k;
    Sinhvien sv;

    cout << "\nNhap lop can loc: ";
    getline(cin, lop);
    hienThiTheoLop(ds, n, lop);

    hienThiLopDiemLonHon5(ds, n, lop);

    sinhVienMax(ds, n);

    // f) Thêm cu?i
    cout << "\nNhap sinh vien moi (them cuoi):\n";
    cout << "MaSV: "; getline(cin, sv.MaSV);
    cout << "Hoten: "; getline(cin, sv.Hoten);
    cout << "Lop: "; getline(cin, sv.Lop);
    cout << "Diem: "; cin >> sv.Diem; cin.ignore();
    themCuoi(ds, n, sv);
    hienThi(ds, n);

    // g) Thêm sau k
    cout << "\nNhap vi tri k de them sau: ";
    cin >> k; cin.ignore();
    cout << "Nhap sinh vien moi:\n";
    cout << "MaSV: "; getline(cin, sv.MaSV);
    cout << "Hoten: "; getline(cin, sv.Hoten);
    cout << "Lop: "; getline(cin, sv.Lop);
    cout << "Diem: "; cin >> sv.Diem; cin.ignore();
    themSauK(ds, n, sv, k);
    hienThi(ds, n);

    // h) Xóa t?i k
    cout << "\nNhap vi tri k de xoa: ";
    cin >> k;
    xoaTaiK(ds, n, k);
    hienThi(ds, n);

    // k) S?p x?p gi?m d?n
    sapXepGiamTheoDiem(ds, n);
    cout << "\nDanh sach sau sap xep giam theo diem:\n";
    hienThi(ds, n);

    // l) Chuy?n l?p
    cin.ignore();
    cout << "\nNhap MaSV can chuyen lop: ";
    getline(cin, ma);
    cout << "Nhap lop moi: ";
    getline(cin, lop);
    chuyenLop(ds, n, ma, lop);
    hienThi(ds, n);

    // n) Max theo l?p
    cout << "\nNhap lop can tim diem cao nhat: ";
    getline(cin, lop);
    maxTheoLop(ds, n, lop);

    // o) Xóa cu?i
    xoaCuoi(ds, n);
    cout << "\nDanh sach sau khi xoa sinh vien cuoi:\n";
    hienThi(ds, n);

    delete[] ds;
    system("pause");
    return 0;
}

