import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AbrirPlanilha {
    public static void main(String[] args) {
        String caminhoArquivo = "C:/Users/DG6438/OneDrive - ENGIE/Auxiliar/Imagens/Teste Excel/Teste.xlsx";

        try (FileInputStream arquivo = new FileInputStream(new File(caminhoArquivo));
                Workbook workbook = new XSSFWorkbook(arquivo)) {

            Sheet folha = workbook.getSheetAt(0); // Pegando a primeira aba da planilha

            for (Row linha : folha) {
                for (Cell celula : linha) {
                    switch (celula.getCellType()) {
                        case STRING -> System.out.print(celula.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(celula.getNumericCellValue() + "\t");
                        case BOOLEAN -> System.out.print(celula.getBooleanCellValue() + "\t");
                        default -> System.out.print("\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir a planilha: " + e.getMessage());
        }
    }
}
