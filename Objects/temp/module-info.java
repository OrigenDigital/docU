module b4j {
requires jdk.localedata;
requires jdk.charsets;
requires jdk.crypto.ec;
requires java.base;
requires java.datatransfer;
requires java.desktop;
requires java.logging;
requires java.management;
requires java.security.jgss;
requires java.sql;
requires java.xml;
requires java.xml.crypto;
requires javafx.base;
requires javafx.controls;
requires javafx.fxml;
requires javafx.graphics;
requires javafx.media;
requires javafx.swing;
requires jdk.management;
requires jdk.unsupported;
exports b4j.docU;
uses java.sql.Driver;
uses org.apache.poi.extractor.ExtractorProvider;
uses org.apache.poi.sl.draw.ImageRenderer;
uses org.apache.poi.sl.usermodel.SlideShowProvider;
uses org.apache.poi.ss.usermodel.WorkbookProvider;
provides org.apache.poi.extractor.ExtractorProvider with org.apache.poi.extractor.MainExtractorFactory, org.apache.poi.ooxml.extractor.POIXMLExtractorFactory; provides org.apache.poi.sl.draw.ImageRenderer with org.apache.poi.sl.draw.BitmapImageRenderer, org.apache.poi.xslf.draw.SVGImageRenderer; provides org.apache.poi.ss.usermodel.WorkbookProvider with org.apache.poi.hssf.usermodel.HSSFWorkbookFactory, org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;opens org.apache.xmlbeans.metadata.system.sXMLTOOLS; opens org.apache.xmlbeans.metadata.system.sXMLSCHEMA;opens org.apache.xmlbeans.metadata.system.sXMLLANG;opens org.apache.xmlbeans.metadata.system.sXMLCONFIG;opens org.apache.poi.schemas.ooxml.system.ooxml;}