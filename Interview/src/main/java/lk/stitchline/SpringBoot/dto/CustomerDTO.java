package lk.stitchline.SpringBoot.dto;

public class CustomerDTO {
    private String userName;
    private String name;
    private String email;
    private int mobile;
    private String password;
    private String address;
    private String nic;
    private String empNo;
    private String userType;

    public CustomerDTO() {
    }

    public CustomerDTO(String userName, String name, String email, int mobile, String password, String address, String nic, String empNo, String userType) {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.address = address;
        this.nic = nic;
        this.empNo = empNo;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", nic='" + nic + '\'' +
                ", empNo='" + empNo + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
