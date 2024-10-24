import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://stg-web.troben.cloud/')

WebUI.click(findTestObject('HomePage/button_Beranda_hamburger'))

WebUI.click(findTestObject('HomePage/Navigasi login'))

WebUI.setText(findTestObject('Halaman Login/input email'), 'testsqa24@dev.com')

WebUI.setText(findTestObject('Halaman Login/input password'), 'testsqa24')

WebUI.click(findTestObject('Halaman Login/button_Masuk'))

WebUI.click(findTestObject('HomePage/button_Beranda_hamburger'))

WebUI.waitForElementPresent(findTestObject('HomePage/a_Riwayat'), 0)

WebUI.click(findTestObject('HomePage/button_Order Sekarang (Cargo)'))

WebUI.setText(findTestObject('Cargo/1.nama pengirim'), 'dhika')

WebUI.setText(findTestObject('Cargo/2.no telp pengirim'), '82113542714')

WebUI.setText(findTestObject('Cargo/3.alamat pengirim'), 'jakarta selatan')

WebUI.click(findTestObject('Cargo/div_Jakarta SelatanSouth Jakarta City, Jakarta, Indonesia (pengirim)'))

WebUI.setText(findTestObject('Cargo/4.detail alamat pengirim'), 'dekat showroom')

WebUI.setText(findTestObject('Cargo/5.nama penerima'), 'satria')

WebUI.setText(findTestObject('Cargo/6.no telp penerima'), '81510221490')

WebUI.setText(findTestObject('Cargo/7.kota penerima'), 'bandung')

WebUI.click(findTestObject('Cargo/div_Kota Tegal, Tegal Selatan, Bandung (penerima)'))

WebUI.click(findTestObject('Cargo/8.button_Tambah Barang'))

WebUI.click(findTestObject('Cargo/9.kategori tambah barang'))

WebUI.setText(findTestObject('Cargo/10.input_Berat Barang (kg)_16'), '100')

WebUI.setText(findTestObject('Cargo/11.input_Jumlah Paket_17'), '2')

WebUI.setText(findTestObject('Cargo/12.input_Dimensi Barang_18'), '100')

WebUI.setText(findTestObject('Cargo/13.input_Dimensi Barang_19'), '50')

WebUI.setText(findTestObject('Cargo/14.input_Dimensi Barang_20'), '25')

WebUI.setText(findTestObject('Cargo/15, Deskripsi barang'), 'deskripsi')

WebUI.click(findTestObject('Cargo/16.button_Simpan'))

WebUI.click(findTestObject('Cargo/17, armada'))

WebUI.click(findTestObject('Cargo/18, armada mpv'))

WebUI.click(findTestObject('Cargo/19.button_Simpan armada'))

WebUI.click(findTestObject('Cargo/20.Pilih Mitra'))

WebUI.click(findTestObject('Cargo/21, MB-JKT-11 (mitra)'))

WebUI.click(findTestObject('Cargo/22.button_Simpan(mitra)'))

WebUI.click(findTestObject('Cargo/23,button_Simpan cargo'))

WebUI.waitForElementPresent(findTestObject('Cargo/24.Pesanan Berhasil Dibuat'), 20)

