import Excel from 'exceljs';

// read from a file
const workbook = new Excel.Workbook();

// https://stackoverflow.com/questions/28864652/node-exceljs-reading-file
async function readExcelFile() {

    console.log('The current working directory is ' + process.cwd());

    try {

        // Adjust the file path as needed
        await workbook.xlsx.readFile('./WMAAgeGradingCalculator-2023-v3.xlsx');
    
        // Get sheet by name
        const worksheet = workbook.getWorksheet('Factors');
    
        if (!worksheet) {
          console.error('Worksheet "Factors" not found.');
          return;
        }
    
        // Process each row
        worksheet.eachRow({ includeEmpty: true }, (row, rowNumber) => {
          console.log(`Row ${rowNumber}:`, row.values);
        });

    } catch(error) {
        console.error("Error reading Excel file:", error);
    }
}

readExcelFile();