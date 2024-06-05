# Spring Data JPA

### Propogation Transactional
1. Mandatory : Method sebagai transactional, jika dipanggil harus dengan method yang transactional juga. 
__Harus dipanggil dari kelas lain yang ada transactionalnya__

2. Nested : Akan membuat transactional lain di transaksi sekarang yang sudah ada transaksional nya, mirip required.

3. Required: __dia support jika sudah ada transactional, jika belum dia buat sendiri__

4. requires_new: dia akan selalu membuat transaksional baru, jika dia dipanggil dari method transaksional juga. 
maka method sebelumnya ditunda dan akan menggunakan transaksion baru
5. methodnya tidak boleh dijalankan di transaksion, jika method yang manggil sudah transaksional maka akan error
6. beda kaya never, kalo never throw exception. kalo not_supported transactionalnya akan dihentikan dulu, 
tapi jika sudah jalan methodnya, nanti dia baru dijalankan lagi.
7. kalo dia dipanggil dari transactional dia supoort, tapi dia di executenya di non transaksional jika tidak ada transaksional