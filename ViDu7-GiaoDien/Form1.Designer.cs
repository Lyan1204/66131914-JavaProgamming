namespace ViDu7_GiaoDien
{
    partial class CSS
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            txemail = new Label();
            txpass = new Label();
            textBox1 = new TextBox();
            textBox2 = new TextBox();
            txsubmit = new Button();
            txclear = new Button();
            SuspendLayout();
            // 
            // txemail
            // 
            txemail.AutoSize = true;
            txemail.Location = new Point(220, 116);
            txemail.Name = "txemail";
            txemail.Size = new Size(71, 32);
            txemail.TabIndex = 0;
            txemail.Text = "Email";
            // 
            // txpass
            // 
            txpass.AutoSize = true;
            txpass.Location = new Point(220, 197);
            txpass.Name = "txpass";
            txpass.Size = new Size(121, 32);
            txpass.TabIndex = 1;
            txpass.Text = "Passsword";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(354, 109);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(332, 39);
            textBox1.TabIndex = 2;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // textBox2
            // 
            textBox2.Location = new Point(354, 190);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(332, 39);
            textBox2.TabIndex = 3;
            // 
            // txsubmit
            // 
            txsubmit.BackColor = Color.SlateBlue;
            txsubmit.Location = new Point(220, 285);
            txsubmit.Name = "txsubmit";
            txsubmit.Size = new Size(131, 54);
            txsubmit.TabIndex = 4;
            txsubmit.Text = "Submit";
            txsubmit.UseVisualStyleBackColor = false;
            txsubmit.Click += txsubmit_Click;
            // 
            // txclear
            // 
            txclear.BackColor = Color.SlateBlue;
            txclear.Location = new Point(357, 285);
            txclear.Name = "txclear";
            txclear.Size = new Size(131, 54);
            txclear.TabIndex = 5;
            txclear.Text = "Clear";
            txclear.UseVisualStyleBackColor = false;
            // 
            // CSS
            // 
            AutoScaleDimensions = new SizeF(13F, 32F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(990, 519);
            Controls.Add(txclear);
            Controls.Add(txsubmit);
            Controls.Add(textBox2);
            Controls.Add(textBox1);
            Controls.Add(txpass);
            Controls.Add(txemail);
            Name = "CSS";
            Text = "CSS";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label txemail;
        private Label txpass;
        private TextBox textBox1;
        private TextBox textBox2;
        private Button txsubmit;
        private Button txclear;
    }
}
