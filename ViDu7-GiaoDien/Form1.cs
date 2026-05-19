namespace ViDu7_GiaoDien
{
    public partial class CSS : Form
    {
        public CSS()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // Ẩn ký tự mật khẩu khi form load
            textBox2.PasswordChar = '*';

            // Màu chữ button
            txsubmit.ForeColor = Color.White;
            txclear.ForeColor = Color.White;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            // Có thể validate email realtime ở đây nếu cần
        }

        private void txsubmit_Click(object sender, EventArgs e)
        {
            // Kiểm tra không để trống
            if (string.IsNullOrWhiteSpace(textBox1.Text) ||
                string.IsNullOrWhiteSpace(textBox2.Text))
            {
                MessageBox.Show("Vui lòng nhập đầy đủ Email và Password!",
                    "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            // Hiển thị thông báo thành công
            MessageBox.Show($"Đăng nhập thành công!\nEmail: {textBox1.Text}",
                "Thành công", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void txclear_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox1.Focus(); // focus về Email sau khi clear
        }
    }
}