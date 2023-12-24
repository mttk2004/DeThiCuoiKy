// truy xuất các thành phần
const hoTenInput = document.querySelector("#txtHoten");
const cmndInput = document.querySelector("#txtcmnd");
const mucGiaInput = document.querySelector("#cboMucgia");
const anSangInput = document.querySelector("#chkAnsang");
const giatUiInput = document.querySelector("#chkGiatui");
const baoBuoiSangInput = document.querySelector("#chkBaobuoisang");
const ngayThueInput = document.querySelector("#dateNgaythue");
const ngayTraInput = document.querySelector("#dateNgaytra");
const tienThueInput = document.querySelector("#txtTienthuephong");
const dangKy = document.querySelector("#subDangky");
const tinhDonGia = document.querySelector("#btnTinhdongia");

// kiểm tra các trường bắt buộc phải nhập khi đăng ký
const kiemTraCacTruongBatBuoc = () => {
  if (!hoTenInput.value) {
    alert("Họ tên không được rỗng");
    hoTenInput.focus();
    return;
  }

  if (!cmndInput.value) {
    alert("CMND không được rỗng");
    cmndInput.focus();
    return;
  }

  const regex = /^\d+$/;
  if (!regex.test(cmndInput.value)) {
    alert("CMND phải là số");
    cmndInput.focus();
    return;
  }
};

// tính số ngày thuê phòng
const soNgayThue = () => {
  if (!ngayThueInput.value || !ngayTraInput.value) {
    return 1;
  } else {
    const ngayThue = new Date(ngayThueInput.value);
    const ngayTra = new Date(ngayTraInput.value);

    if (ngayThue > ngayTra) {
      alert("Ngày trả phải sau ngày thuê");
      return false;
    }

    return (ngayTra - ngayThue) / (24 * 60 * 60 * 1000) + 1;
  }
};

// tính số tiền thuê phòng
const tienThue = () => {
  const soNgay = soNgayThue();
  if (soNgay === false) {
    return false;
  }

  let soTienThue = 0;
  let soDichVuDatThem = 0;

  const loai = mucGiaInput.value;
  switch (loai) {
    case "a":
      soTienThue = 150000;
      break;
    case "b":
      soTienThue = 300000;
      break;
    case "c":
      soTienThue = 500000;
  }

  if (anSangInput.checked) soDichVuDatThem++;
  if (giatUiInput.checked) soDichVuDatThem++;
  if (baoBuoiSangInput.checked) soDichVuDatThem++;
  if (loai !== "a") soDichVuDatThem--;

  console.log(soTienThue);
  soTienThue += soDichVuDatThem * 0.05 * soTienThue;
  soTienThue *= soNgay;

  return soTienThue;
};

// hiển thị tiền thuê phòng
const hienThiTienThue = () => {
  const tienThuePhong = tienThue();
  if (tienThuePhong === false) {
    return false;
  }

  tienThueInput.value = tienThuePhong;
};

// sự kiện cho nút đăng ký
dangKy.addEventListener("click", (e) => {
  e.preventDefault();

  kiemTraCacTruongBatBuoc();
});

// sự kiện cho nút tính đơn giá
tinhDonGia.addEventListener("click", (e) => {
  e.preventDefault();

  hienThiTienThue();
});

// sự kiện khi chọn mức giá
mucGiaInput.addEventListener("input", () => {
  if (mucGiaInput.value !== "a") {
    anSangInput.checked = true;
    anSangInput.disabled = true;
  } else {
    anSangInput.checked = false;
    anSangInput.disabled = false;
  }
});
