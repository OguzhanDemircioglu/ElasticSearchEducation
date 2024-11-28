PUT /musteri/_doc/1
{
  "id": 4,
  "ad": "Oguz",
  "aktifM": true,
  "iletisim": {
    "adres": "Ankara",
    "tel": "412412"
  }
}

GET musteri/_doc/1

GET musteri/_source/1

POST musteri/_update/1
{
  "doc": {
    "ad": "Iğuzhan Demircioğlu"
  }
}

DELETE musteri/_doc/1

PUT urun/_doc/12
{
  "id": 445,
"barkod" : 3434535345,
"ad": "Anakart Asus Z342 19 7700MH",
"fiyat" :33899.1,
"uretİmtarİh": "2024/02/05"
}

GET urun/_doc/12

GET urun/_mapping

PUT satis
{
  "mappings": {
    "properties": {
      "musteriId": {"type": "long"},
      "urunId": {"type": "long"},
      "adet": {"type": "float"},
      "aktif": {"type": "boolean"}
}
  }
}

GET satis/_mapping

PUT satis/_doc/12
{
  "id": 445,
"barkod" : 3434535345,
"adet": "12.4154",
"aktif" :true
}

GET satis/_doc/12


