var net = require('net');
net.createServer(function(socket){
    //socket.write('hello\n');
    //socket.write('world\n');
    socket.on('data', function(data){
		console.log("data:", data.toString());
		console.log("waiting ", data.toString(), "milliseconds...");
		//i=5;
		setTimeout(function() {
			//console.log(i);
        	socket.write(data.toString() + "\n")
		}, data);
    });
}).listen(7);
