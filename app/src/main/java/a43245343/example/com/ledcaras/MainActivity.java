package a43245343.example.com.ledcaras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
    MqttAndroidClient client;
    String IP = "tcp://10.152.2.57:1883";
    String topic = "Raspberry/led";
    int qos = 1;
    String Final;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String clientId = MqttClient.generateClientId();
        client = new MqttAndroidClient(this.getApplicationContext(), IP, clientId);

        MqttConnectOptions options = new MqttConnectOptions();
        CheckBox a1=(CheckBox)findViewById(R.id.checkBox1);
        CheckBox a2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox a3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox a4=(CheckBox)findViewById(R.id.checkBox4);
        CheckBox a5=(CheckBox)findViewById(R.id.checkBox5);
        CheckBox a6=(CheckBox)findViewById(R.id.checkBox6);
        CheckBox a7=(CheckBox)findViewById(R.id.checkBox7);
        CheckBox a8=(CheckBox)findViewById(R.id.checkBox8);
        CheckBox b1=(CheckBox)findViewById(R.id.checkBox9);
        CheckBox b2=(CheckBox)findViewById(R.id.checkBox10);
        CheckBox b3=(CheckBox)findViewById(R.id.checkBox11);
        CheckBox b4=(CheckBox)findViewById(R.id.checkBox12);
        CheckBox b5=(CheckBox)findViewById(R.id.checkBox13);
        CheckBox b6=(CheckBox)findViewById(R.id.checkBox14);
        CheckBox b7=(CheckBox)findViewById(R.id.checkBox15);
        CheckBox b8=(CheckBox)findViewById(R.id.checkBox16);
        CheckBox c1=(CheckBox)findViewById(R.id.checkBox17);
        CheckBox c2=(CheckBox)findViewById(R.id.checkBox18);
        CheckBox c3=(CheckBox)findViewById(R.id.checkBox19);
        CheckBox c4=(CheckBox)findViewById(R.id.checkBox20);
        CheckBox c5=(CheckBox)findViewById(R.id.checkBox21);
        CheckBox c6=(CheckBox)findViewById(R.id.checkBox22);
        CheckBox c7=(CheckBox)findViewById(R.id.checkBox23);
        CheckBox c8=(CheckBox)findViewById(R.id.checkBox24);
        CheckBox d1=(CheckBox)findViewById(R.id.checkBox25);
        CheckBox d2=(CheckBox)findViewById(R.id.checkBox26);
        CheckBox d3=(CheckBox)findViewById(R.id.checkBox27);
        CheckBox d4=(CheckBox)findViewById(R.id.checkBox28);
        CheckBox d5=(CheckBox)findViewById(R.id.checkBox29);
        CheckBox d6=(CheckBox)findViewById(R.id.checkBox30);
        CheckBox d7=(CheckBox)findViewById(R.id.checkBox31);
        CheckBox d8=(CheckBox)findViewById(R.id.checkBox32);
        CheckBox e1=(CheckBox)findViewById(R.id.checkBox33);
        CheckBox e2=(CheckBox)findViewById(R.id.checkBox34);
        CheckBox e3=(CheckBox)findViewById(R.id.checkBox35);
        CheckBox e4=(CheckBox)findViewById(R.id.checkBox36);
        CheckBox e5=(CheckBox)findViewById(R.id.checkBox37);
        CheckBox e6=(CheckBox)findViewById(R.id.checkBox38);
        CheckBox e7=(CheckBox)findViewById(R.id.checkBox39);
        CheckBox e8=(CheckBox)findViewById(R.id.checkBox40);
        CheckBox f1=(CheckBox)findViewById(R.id.checkBox41);
        CheckBox f2=(CheckBox)findViewById(R.id.checkBox42);
        CheckBox f3=(CheckBox)findViewById(R.id.checkBox43);
        CheckBox f4=(CheckBox)findViewById(R.id.checkBox44);
        CheckBox f5=(CheckBox)findViewById(R.id.checkBox45);
        CheckBox f6=(CheckBox)findViewById(R.id.checkBox46);
        CheckBox f7=(CheckBox)findViewById(R.id.checkBox47);
        CheckBox f8=(CheckBox)findViewById(R.id.checkBox48);
        CheckBox g1=(CheckBox)findViewById(R.id.checkBox49);
        CheckBox g2=(CheckBox)findViewById(R.id.checkBox50);
        CheckBox g3=(CheckBox)findViewById(R.id.checkBox51);
        CheckBox g4=(CheckBox)findViewById(R.id.checkBox52);
        CheckBox g5=(CheckBox)findViewById(R.id.checkBox53);
        CheckBox g6=(CheckBox)findViewById(R.id.checkBox54);
        CheckBox g7=(CheckBox)findViewById(R.id.checkBox55);
        CheckBox g8=(CheckBox)findViewById(R.id.checkBox56);
        CheckBox h1=(CheckBox)findViewById(R.id.checkBox57);
        CheckBox h2=(CheckBox)findViewById(R.id.checkBox58);
        CheckBox h3=(CheckBox)findViewById(R.id.checkBox59);
        CheckBox h4=(CheckBox)findViewById(R.id.checkBox60);
        CheckBox h5=(CheckBox)findViewById(R.id.checkBox61);
        CheckBox h6=(CheckBox)findViewById(R.id.checkBox62);
        CheckBox h7=(CheckBox)findViewById(R.id.checkBox63);
        CheckBox h8=(CheckBox)findViewById(R.id.checkBox64);

        String bin1 = a1.isChecked()?"1":"0";
        String bin2 = a2.isChecked()?"1":"0";
        String bin3 = a3.isChecked()?"1":"0";
        String bin4 = a4.isChecked()?"1":"0";
        String bin5 = a5.isChecked()?"1":"0";
        String bin6 = a6.isChecked()?"1":"0";
        String bin7 = a7.isChecked()?"1":"0";
        String bin8 = a8.isChecked()?"1":"0";
        String bin9 = b1.isChecked()?"1":"0";
        String bin10 = b2.isChecked()?"1":"0";
        String bin11= b3.isChecked()?"1":"0";
        String bin12 = b4.isChecked()?"1":"0";
        String bin13 = b5.isChecked()?"1":"0";
        String bin14 = b6.isChecked()?"1":"0";
        String bin15 = b7.isChecked()?"1":"0";
        String bin16 = b8.isChecked()?"1":"0";
        String bin17 = c1.isChecked()?"1":"0";
        String bin18 = c1.isChecked()?"1":"0";
        String bin19 = c3.isChecked()?"1":"0";
        String bin20 = c4.isChecked()?"1":"0";
        String bin21 = c5.isChecked()?"1":"0";
        String bin22 = c6.isChecked()?"1":"0";
        String bin23 = c7.isChecked()?"1":"0";
        String bin24 = c8.isChecked()?"1":"0";
        String bin25 = d1.isChecked()?"1":"0";
        String bin26 = d2.isChecked()?"1":"0";
        String bin27= d3.isChecked()?"1":"0";
        String bin28 = d4.isChecked()?"1":"0";
        String bin29 = d5.isChecked()?"1":"0";
        String bin30 = d6.isChecked()?"1":"0";
        String bin31 = d7.isChecked()?"1":"0";
        String bin32 = d8.isChecked()?"1":"0";
        String bin33 = e1.isChecked()?"1":"0";
        String bin34 = e2.isChecked()?"1":"0";
        String bin35 = e3.isChecked()?"1":"0";
        String bin36 = e4.isChecked()?"1":"0";
        String bin37 = e5.isChecked()?"1":"0";
        String bin38 = e6.isChecked()?"1":"0";
        String bin39 = e7.isChecked()?"1":"0";
        String bin40 = e8.isChecked()?"1":"0";
        String bin41 = f1.isChecked()?"1":"0";
        String bin42 = f2.isChecked()?"1":"0";
        String bin43= f3.isChecked()?"1":"0";
        String bin44 = f4.isChecked()?"1":"0";
        String bin45 = f5.isChecked()?"1":"0";
        String bin46 = f6.isChecked()?"1":"0";
        String bin47 = f7.isChecked()?"1":"0";
        String bin48 = f8.isChecked()?"1":"0";
        String bin49= g1.isChecked()?"1":"0";
        String bin50= g2.isChecked()?"1":"0";
        String bin51= g3.isChecked()?"1":"0";
        String bin52= g4.isChecked()?"1":"0";
        String bin53 = g5.isChecked()?"1":"0";
        String bin54= g6.isChecked()?"1":"0";
        String bin55= g7.isChecked()?"1":"0";
        String bin56= g8.isChecked()?"1":"0";
        String bin57 = h1.isChecked()?"1":"0";
        String bin58 = h2.isChecked()?"1":"0";
        String bin59 = h3.isChecked()?"1":"0";
        String bin60 = h4.isChecked()?"1":"0";
        String bin61 = h5.isChecked()?"1":"0";
        String bin62 = h6.isChecked()?"1":"0";
        String bin63 = h7.isChecked()?"1":"0";
        String bin64 = h8.isChecked()?"1":"0";


        Final= bin1 + bin2 + bin3 + bin4 + bin5 + bin6 + bin7+ bin8+bin9 + bin10 + bin11 + bin12 + bin13+ bin14 + bin15+ bin16+bin17 + bin18 + bin19 + bin20 + bin21 + bin22 + bin23+ bin24+bin25 + bin26 + bin27 + bin28 + bin29 + bin30 + bin31+ bin32+bin33 + bin34 + bin35 + bin36 + bin37 + bin38 + bin39+ bin40+bin41 +  bin42 + bin43 + bin44 + bin45 + bin46 + bin47+ bin48+ bin49 + bin50 + bin51 + bin52 + bin53 + bin54 + bin55+ bin56+bin57 + bin58 + bin59 + bin60 + bin61 + bin62 + bin63+ bin64;

        Log.d("Corroborar","Se cargo el final:" + Final);
        try {

            IMqttToken token = client.connect(options);
            token.setActionCallback(new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    Toast.makeText(MainActivity.this, "Conectado",Toast.LENGTH_LONG).show();
                    // We are connected
                    Log.d("CONEXION","Funciono");

                    try {
                        IMqttToken subToken = client.subscribe(topic, qos);

                        subToken.setActionCallback(new IMqttActionListener() {
                            @Override
                            public void onSuccess(IMqttToken asyncActionToken) {
                                // The message was published
                                Log.d("SUBSCRIPCION","Funciono");
                            }

                            @Override
                            public void onFailure(IMqttToken asyncActionToken,
                                                  Throwable exception) {
                                // The subscription could not be performed, maybe the user was not
                                // authorized to subscribe on the specified topic e.g. using wildcards

                            }
                        });
                    } catch (MqttException e) {
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Toast.makeText(MainActivity.this, "Fallo la conexion",Toast.LENGTH_LONG).show();
                    // Something went wrong e.g. connection timeout or firewall problems
                    Log.d("CONEXION","Fallo");

                }
            });



        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
    public void dibujo (View Vista) {

        String topic = "Raspberry/led";
        Log.d("DIBUJO","dibujo enviado"+ " " + Final);
        try {
            client.publish(topic, Final.getBytes(), 0, false);
        } catch ( MqttException e) {
            e.printStackTrace();
        }
    }

    public void pub (View Vista) {

        EditText Mensaje= (EditText) findViewById(R.id.mensaje);

        String topic = "Raspberry/led";
        String message= Mensaje.getText().toString();
        Log.d("MENSAJE","mensaje enviado"+ " " + message);

        try {
            client.publish(topic, message.getBytes(), 0, false);
        } catch ( MqttException e) {
            e.printStackTrace();
        }

    }
}
