var http=require("http")
http.createServer(function(req,res){
    res.write("Miha")
    res.end()
}).listen(3000)