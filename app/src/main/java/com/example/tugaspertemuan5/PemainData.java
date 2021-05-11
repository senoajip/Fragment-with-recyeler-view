package com.example.tugaspertemuan5;

import java.util.ArrayList;
import java.util.List;

public class PemainData {
    public static List<PemainModel> fill_with_data(){
        List<PemainModel> data = new ArrayList<>();
        data.add(new PemainModel("LeBron James","Los Angeles Lakers", "LeBron merebut kembali tahta NBArank yang dia pegang sembilan dari 10 tahun terakhir dengan memenangkan gelar keempat dan MVP Final pada usia 35. James terus berkembang, memimpin liga dalam hal assist sambil memberikan beberapa gol kepada Davis.",R.drawable.james));
        data.add(new PemainModel("Anthony Davis","Los Angeles Lakers", "Untuk pertama kalinya dalam 10 tahun sejarah NBArank, rekan satu tim finis 1-2. Ini adalah bukti seberapa baik AD bermain di kejuaraan Lakers sehingga dia menciptakan perdebatan tentang siapa yang harus memenangkan MVP Final.",R.drawable. davis));
        data.add(new PemainModel("Giannis Antetokounmpo","Milwaukee Bucks", "setelah memenangkan MVP berturut-turut dan Pemain Bertahan Tahun Ini sebelum usia 26, semua sambil memimpin Bucks ke rekor terbaik NBA di kedua musim.",R.drawable.giannis));
        data.add(new PemainModel("Luka Doncic","Dallas Mavericks", "Superstar hebat berikutnya melayani pemberitahuan ke liga di musim keduanya, menjadi pemain termuda yang pernah mendapatkan penghargaan All-NBA First Team berdasarkan usia pada malam pembukaan. Doncic tampil mengesankan dalam debut playoffnya melawan LA Clippers",R.drawable.doncic));
        data.add(new PemainModel("Kawhi Leonard","LA Clippers", "Musim pertama Leonard di Los Angeles (dan gelembung Orlando) tidak memiliki jenis buku cerita yang sama yang berakhir pada 2019 di Toronto. Clippers, pilihan trendi untuk memenangkan gelar, dikejutkan di babak kedua setelah memimpin seri 3-1 di Nuggets. ",R.drawable.leonard));
        data.add(new PemainModel("Kevin Durant","Brooklyn Nets", "Seberapa baik Durant 18 bulan setelah menderita cedera Achilles selama pertandingan terakhirnya dengan Warriors adalah salah satu pertanyaan swing musim ini. Pemain yang datang dari cedera yang sama terasa kurang efektif daripada yang diproyeksikan setelah mereka kembali, dan KD sepertinya sudah mengalami penurunan di awal usia 30-an.",R.drawable.durant));
        data.add(new PemainModel("Damian Lillard","Portland Trail Blazers", "Kecakapan mencetak gol Lillard menyelamatkan apa yang tampak seperti musim yang hilang karena cedera bagi Blazers. Dia mengumpulkan salah satu peregangan hebat dalam sejarah NBA pada akhir Januari hingga Februari, rata-rata 48,8 poin dan 8,2 3-point per game pada 57% tembakan saat Portland mengalahkan empat tim playoff.",R.drawable.lillard));
        data.add(new PemainModel("Stephen Curry","Golden State Warior", "Ini adalah peringkat Kari terendah sejak menjadi bintang di postseason 2013. Masalahnya adalah ketersediaan, karena patah tulang di tangan kanan Curry membatasi dia pada lima pertandingan musim lalu dan dia melewatkan 44 pertandingan",R.drawable.curry));
        data.add(new PemainModel("James Harden","Houston Rockets", "Selama musim reguler, tidak ada keraguan bahwa Harden jauh lebih berharga daripada yang kesembilan di liga, finis di tiga besar dalam voting MVP lima dari enam musim terakhir. Jelas, panel kami lebih menekankan pada kinerja postseason Harden yang tidak merata.",R.drawable.harden));
        data.add(new PemainModel("Nikola Jokic","Denver Nuggets", "Jokic rata-rata mencetak 26,3 poin. Itu turun menjadi 24,4 melawan LA Clippers , tetapi Jokic mendominasi gelas (13,4 rebound) dan rata-rata 6,6 assist. Meskipun masalah pelanggaran membatasi Jokic melawan juara akhirnya Lakers, dia masih membuat 58% dari percobaan 2 poinnya dalam seri yang efisien.",R.drawable.jokik));

        return data;
    }
}
