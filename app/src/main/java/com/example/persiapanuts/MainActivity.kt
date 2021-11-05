package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.profil,"LAYANAN BHAKTI ASIH","Profil Rumah Sakit","Rumah Sakit Bhakti Asih Brebes merupakan rumah sakit umum swasta pertama di Kabupaten Brebes yang merupakan suatu lembaga pelayanan kesehatan terhadap masyarakat, yang pada awalnya dikelola oleh “Yayasan Bhakti Asih” dan kemudian menjadi “PT. Bhakti Asih”."))

        data?.add(DataModel(R.drawable.poliklinik,"LAYANAN BHAKTI ASIH","Info Poliklinik", "Spesialis Kebidanan dan Kandungan, Spesialis Penyakit Dalam, Spesialis Bedah Umum, Spesialis Bedah Tulang."))

        data?.add(DataModel(R.drawable.dokter,"LAYANAN BHAKTI ASIH","Info Dokter", "dr. H. M. Budi Susatya, Sp. A\n" +
                "dr. Aries Suparmiati, Sp.A. \n" +
                "dr. Arya Yuniardi \n" +
                "Susatya, Sp.A\n" +
                "dr. Arie Indrianto, Sp. OG, dr. H. Susilo Kuswoyo, Sp. OG."))

        data?.add(DataModel(R.drawable.kamar,"LAYANAN BHAKTI ASIH","Info Kamar", "VIP HARGA TARIF PELAYANAN RAWAT INAP KELAS VIP : Rp. 585.000\n" +
                "KELAS I HARGA : Rp. 475.000\n" +
                "KELAS II HARGA : Rp. 365.000\n" +
                "KELAS III HARGA : Rp. 300.000."))

        data?.add(DataModel(R.drawable.pelayanan,"LAYANAN BHAKTI ASIH","Alur Pelayanan", "PENDAFTARAN ONLINE MELALUI WHATSAPP. Buka aplikasi WhatSapp\n" +
                "Ketik chat dengan format: DAFTAR#POLI TUJUAN#NAMA DOKTER#CARA BAYAR (UMUM/BPJS/ASURANSI)#NAMA PASIEN#NO. BPJS (KOSONGKAN JIKA BUKAN BPJS)#NO. RM (ketik BARU, untuk pasien baru)#TTL#ALAMAT\n" +
                "Contoh : DAFTAR#JANTUNG#DR. ARBY LIZARDA,SP.JP#UMUM#SURYONO#BARU#TEGAL, 12 OKTOBER 1960#TEGAL RT3/2\n" +
                "KIRIM KE 085-647-067-065."))

        data?.add(DataModel(R.drawable.cekup,"LAYANAN BHAKTI ASIH","Medical Check Up", "Medical check up adalah upaya yang membantu Anda untuk bisa mengetahui kondisi tubuh terkini dan potensi penyakit yang menjangkit tubuh tanpa menimbulkan gejala. Dengan melakukan pemeriksaan ini, Anda dapat segera mendeteksi masalah kesehatan yang mungkin dialami dan bisa melakukan penanganan medis yang tepat dengan segera. Dengan begitu, penyakit tidak akan sampai berkembang lebih parah lagi hingga berakibat fatal di kemudian hari\n" +
                "\n" +
                "Medical check-up diperlukan oleh perempuan dan laki-laki, baik anak muda maupun orang lanjut usia. Orang yang terlihat sehat pun perlu melakukan medical check-up, terutama untuk memeriksa tingkat kesehatan serta kemungkinan adanya penyakit serius yang belum menunjukkan gejala"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

    private fun DataModel(gambar: Int, lokasi: String, nama: String) {

    }
}