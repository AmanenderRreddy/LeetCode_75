param(
    [string]$Day,
    [string]$LCNum,
    [string]$Name
)

if (-not $Day)   { $Day   = Read-Host "Day number (e.g. 13)" }
if (-not $LCNum) { $LCNum = Read-Host "LeetCode number (e.g. 1679)" }
if (-not $Name)  { $Name  = Read-Host "Problem name (e.g. Max_Number_of_K_Sum_Pairs)" }

$Day = $Day.PadLeft(2, '0')
$FolderName = "solutions/${Day}_${LCNum}_${Name}"

if (Test-Path $FolderName) {
    Write-Host "Folder already exists: $FolderName"
    exit 1
}

New-Item -ItemType Directory -Path $FolderName | Out-Null

$stub = @"
// Day $Day | LeetCode 75 | LC$LCNum - $Name

public class Solution {
    // TODO
}
"@

Set-Content -Path "$FolderName/Solution.java" -Value $stub -Encoding utf8

Write-Host "Created: $FolderName/Solution.java"

if (Get-Command code -ErrorAction SilentlyContinue) {
    code "$FolderName/Solution.java"
}

Write-Host ""
Write-Host "Run these commands to commit and push:"
Write-Host "  git add $FolderName/Solution.java"
Write-Host "  git commit -m `"Add Day $Day | LC$LCNum - $Name`""
Write-Host "  git push origin main"
