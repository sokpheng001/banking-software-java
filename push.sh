git add .
echo -n "[+] Enter git message: "
read msg
git commit -m "$msg"

git push -u origin master