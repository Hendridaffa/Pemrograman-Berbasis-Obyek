# Jawaban Pertemuan 6

## Percobaan 1
1. Error, karena tidak terdapat extends ClassA pada ClassB.

2. Error karena program karena belum ditambahkan kode extends ClassA pada ClassB untuk mengambil data yang ada pada ClaasA, sehingga data yang ada pada class B tidak dapat ditemukan.

## Percobaan 2
1. Terjadi Error pada kode program:
A. Source Code pada ClassA:
public class ClassA {

    public int x;
    public int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x : " + x);
        System.out.println("nilai y : " + y);
    }
}
B. Source Code ClassB:
public class ClassB extends ClassA {

    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}
2. Error karena didalam ClassA terjadi error karena tipe modifiernya adalah private sehingga tidak bisa terbaca pada ClassB

## Percobaan 3
1. Fungsi dari super pada super.phi dan super.r adalah untuk mengisi variabel yang ada diluar class. Karena variabel phi dan r berada pada Bangun dan baru diisi didalam Tabung sehingga kita perlu menggunakan super untuk mengisi variabel phi dan r yang berada diluar Tabung. 
2. Fungsi "super" dan "this" pada method volume adalah untuk memanggil variabel, tetapi "super" untuk memanggil variabel yang berada diluar class sedangkan untuk "this" memanggil variabel yang ada di dalam class.
3. Pada Class Tabung tidak dideklarasikan "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut karena penggunan "super" pada atribut mereka.

##Percobaan 4
1. 	- superclass adalah ClassA
	- subclass adalah ClassB dan ClassC
	Hal ini dikarenakan ClassB dan ClassC merupakan turunan atau mendapatkan warisan dari ClassA.
2. Tidak terdapat perubahan dari hasil output, maka tetap sama dengan sebelumnya.
3. Terjadi eror apabila "super();" dituliskan setelah konstruktor karena objek akan mengeksekusi di konstruktor parentclass karena ClassC merupakan turunan dari ClassB dan ClassB adalah turunan dari ClassA.
4. Fungsi dari "super();" adalah agar dapat merujuk ke konstruktor parentclass.