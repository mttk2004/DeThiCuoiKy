-- 3.1
CREATE TABLE san_pham(
	ma_san_pham VARCHAR(10) PRIMARY KEY,
	ten_san_pham VARCHAR(100) UNIQUE NOT NULL,
	noi_san_xuat VARCHAR(100)
);

CREATE TABLE khach_hang(
	ma_khach_hang VARCHAR(10) PRIMARY KEY,
	ho_ten VARCHAR(50) NOT NULL,
	ngay_sinh DATE,
	dia_chi VARCHAR(100)
);

CREATE TABLE hoa_don(
	ma_hoa_don VARCHAR(10) PRIMARY KEY,
	ma_khach_hang VARCHAR(10) REFERENCES khach_hang(ma_khach_hang) NOT NULL,
	ngay_mua_hang DATE NOT NULL
);

CREATE TABLE chi_tiet_hoa_don(
	ma_hoa_don VARCHAR(10) REFERENCES hoa_don(ma_hoa_don),
	ma_san_pham VARCHAR(10) REFERENCES san_pham(ma_san_pham),
	so_luong SMALLINT NOT NULL,
	PRIMARY KEY (ma_hoa_don, ma_san_pham)
);

-- 3.2
-- a
SELECT * 
FROM san_pham
WHERE noi_san_xuat = 'My';

-- b
SELECT ho_ten
FROM 
	khach_hang JOIN
	hoa_don ON khach_hang.ma_khach_hang = hoa_don.ma_khach_hang
WHERE ngay_mua_hang = '2020-05-20';

-- c
SELECT sp.ma_san_pham, ten_san_pham
FROM 
	san_pham sp JOIN
	chi_tiet_hoa_don ct ON sp.ma_san_pham = ct.ma_san_pham
WHERE ma_hoa_don = 'MS1234';

-- d
SELECT COUNT(DISTINCT khach_hang.ma_khach_hang)
FROM 
	khach_hang JOIN
	hoa_don ON khach_hang.ma_khach_hang = hoa_don.ma_khach_hang
WHERE ngay_mua_hang = '2020-06-16';

-- e
SELECT COUNT(*)
FROM
	san_pham sp JOIN
	chi_tiet_hoa_don ct ON sp.ma_san_pham = ct.ma_san_pham
WHERE sp.ten_san_pham = 'Tu lanh';

-- f
SELECT ho_ten, ten_san_pham, so_luong
FROM
	hoa_don hd JOIN
	khach_hang kh ON hd.ma_khach_hang = kh.ma_khach_hang JOIN
	chi_tiet_hoa_don ct ON hd.ma_hoa_don = ct.ma_hoa_don JOIN
	san_pham sp ON sp.ma_san_pham = ct.ma_san_pham
WHERE hd.ma_hoa_don = 'MS1234';