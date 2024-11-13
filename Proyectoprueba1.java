import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import javax.swing.JList;

 

public class Proyectoprueba1 extends JFrame {

 

	private JPanel contentPane;
	private JTextField Autor;
	private JTextField BorrarCodigo;
	private JTextField Titulo;
	private JTextField Genero;
	private JTextField Publicacion;
	private JTextField Precio;
	private JTextField Cantidad;
	private JTextField librosComprados;
	private JTextField CodigoComprar;
	public int preciofinal, preciotot, pagar1;
	public String pagar;
	private JTextField Autor2;
	private JTextField Titulo2;
	private JTextField Genero2;
	private JTextField AñoPublicacion2;
	private JTextField Cantidad2;
	private JTextField Precio2;
	private JTextField CuadroConsulta;

 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyectoprueba1 frame = new Proyectoprueba1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

 

	/**
	 * Create the frame.
	 */
	public Proyectoprueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 875);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

 

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Libro que desee eliminar:");
		lblNewLabel_2.setBounds(367, 416, 194, 19);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.BLACK);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Libro que quiera actualizar:");
		lblNewLabel_3.setBounds(355, 162, 257, 23);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_3);
		

		JEditorPane dtrpnLibreriaSantiagos = new JEditorPane();
		dtrpnLibreriaSantiagos.setForeground(Color.BLACK);
		dtrpnLibreriaSantiagos.setBounds(149, 11, 437, 77);
		dtrpnLibreriaSantiagos.setBackground(Color.GREEN);
		dtrpnLibreriaSantiagos.setFont(new Font("Century Gothic", Font.PLAIN, 50));
		dtrpnLibreriaSantiagos.setText("Libreria Santiago's");
		contentPane.add(dtrpnLibreriaSantiagos);

		BorrarCodigo = new JTextField();
		BorrarCodigo.setBounds(405, 446, 86, 20);
		contentPane.add(BorrarCodigo);
		BorrarCodigo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("En la libreria Santiago's, le permitimos publicar su libro para venderlo al publico beneficiandole una ganancia");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(55, 100, 704, 71);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Titulo del libro:");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(130, 168, 149, 14);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_5);
		
		Titulo = new JTextField();
		Titulo.setBounds(136, 197, 86, 20);
		contentPane.add(Titulo);
		Titulo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Genero del libro:");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBounds(10, 231, 116, 14);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_6);
		
		Genero = new JTextField();
		Genero.setBounds(10, 255, 86, 20);
		contentPane.add(Genero);
		Genero.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Año de Publicacion del libro:");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setBounds(136, 231, 206, 14);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_7);
		
		Publicacion = new JTextField();
		Publicacion.setBounds(136, 255, 86, 20);
		contentPane.add(Publicacion);
		Publicacion.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Precio:");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBounds(136, 286, 46, 14);
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_8);
		
		Precio = new JTextField();
		Precio.setBounds(136, 311, 86, 20);
		contentPane.add(Precio);
		Precio.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Autor del Libro: ");
		lblNewLabel.setBounds(10, 168, 116, 14);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(128, 128, 255));
		contentPane.add(lblNewLabel);

		Autor = new JTextField();
		Autor.setBounds(10, 197, 86, 20);
		contentPane.add(Autor);
		Autor.setColumns(10);
		
		JLabel FacturaFinal = new JLabel("");
		FacturaFinal.setForeground(Color.BLACK);
		FacturaFinal.setFont(new Font("Arial", Font.BOLD, 13));
		FacturaFinal.setBounds(161, 687, 284, 42);
		contentPane.add(FacturaFinal);
		
		JLabel ResultEliminar = new JLabel("");
		ResultEliminar.setFont(new Font("Arial", Font.BOLD, 13));
		ResultEliminar.setBounds(334, 530, 403, 14);
		contentPane.add(ResultEliminar);
		
		/**para usar este boton hay que llenar todos los cuadritos, cuando se llenen y se toque el boton, este va a subir toda la informacion
		 * en la base de datos**/
		JButton BotonAutor = new JButton("Publicar");
		BotonAutor.setBounds(65, 358, 89, 23);
		BotonAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/libreria","root" ,"root123");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("insert into libros(titulo,autor,genero,añoPublicacion,precio,librosDisponibles) values "
					+ "('"+Titulo.getText()+"','"+Autor.getText()+"','"+Genero.getText()+"',"+Publicacion.getText()+","
					+ ""+Precio.getText()+","+Cantidad.getText()+")");
					conexion.close();
					Titulo.setText("");
					Autor.setText("");
					Genero.setText("");
					Publicacion.setText("");
					Precio.setText("");
					Cantidad.setText("");
				}catch(SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		contentPane.add(BotonAutor);
		
		Cantidad = new JTextField();
		Cantidad.setBounds(10, 311, 86, 20);
		contentPane.add(Cantidad);
		Cantidad.setColumns(10);
		
		/**este boton borra el libro de la base de datos dependiendo del codigo que se ponga**/
		JButton Borrar = new JButton("Eliminar");
		Borrar.setBounds(405, 495, 86, 23);
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/libreria","root" ,"root123");
					Statement comando=conexion.createStatement();
					int cantidad = comando.executeUpdate("delete from libros where codigo="+BorrarCodigo.getText());
					if (cantidad==1) {
					ResultEliminar.setText("Se elimino con exito");
					BorrarCodigo.setText("");
					}else {
						ResultEliminar.setText("No existe un libro con ese codigo");
					}
					conexion.close();
				}catch(SQLException ex) {
				setTitle(ex.toString());
				}
			}
		});
		contentPane.add(Borrar);
		
		
		JLabel lblNewLabel_9 = new JLabel("Cantidad:");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setBounds(10, 286, 72, 14);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 13));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Comprar");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_10.setBounds(218, 555, 131, 19);
		contentPane.add(lblNewLabel_10);
		
		librosComprados = new JTextField();
		librosComprados.setBounds(281, 624, 86, 20);
		contentPane.add(librosComprados);
		librosComprados.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Libros a comprar:");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_11.setBounds(271, 599, 149, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Codigo del libro a comprar:");
		lblNewLabel_12.setForeground(Color.BLACK);
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_12.setBounds(40, 599, 194, 14);
		contentPane.add(lblNewLabel_12);
		
		CodigoComprar = new JTextField();
		CodigoComprar.setBounds(89, 624, 86, 20);
		contentPane.add(CodigoComprar);
		CodigoComprar.setColumns(10);
		
		JLabel PrecioLibro = new JLabel("Precio:");
		PrecioLibro.setForeground(Color.BLACK);
		PrecioLibro.setFont(new Font("Arial", Font.BOLD, 13));
		PrecioLibro.setBounds(218, 662, 84, 14);
		contentPane.add(PrecioLibro);
		
		/**Con este boton se saca el total a pagar dependiendo del libro a comprar y de la cantidad de los libros aa comprar
		 * aparte, actualiza la cantidad de libros en la base de datos dependiendo de cuantos compren**/
		JButton Comprar = new JButton("Total");
		Comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String librosDisp= Cantidad.getText();
				int librosDis=Integer.parseInt(librosDisp);
				String librosAcomprar = librosComprados.getText();
				int libroscomprar=Integer.parseInt(librosAcomprar);
				preciotot=  librosDis - libroscomprar;
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/libreria","root" ,"root123");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("update libros set librosDisponibles='"+ preciotot+"' where codigo="+CodigoComprar.getText());
					ResultSet titulo = comando.executeQuery("select titulo,precio from libros where codigo="+CodigoComprar.getText());
					if (titulo.next()==true) {
						CodigoComprar.setText(titulo.getString("titulo"));
						String PrecioMul= titulo.getString("precio");
						int Prec=Integer.parseInt(PrecioMul);
						String librosAcomprar1 = librosComprados.getText();
						int libroscomprar2=Integer.parseInt(librosAcomprar1);
						int resul=Prec*libroscomprar2;
						FacturaFinal.setText("EL precio total es de: "+ resul);
					}else {
						FacturaFinal.setText("No existe un libro con ese codigo");
					}
				}catch(SQLException ex) {
				setTitle(ex.toString());
				}
			}
		});
		Comprar.setBounds(202, 737, 89, 23);
		contentPane.add(Comprar);
		
		Autor2 = new JTextField();
		Autor2.setBounds(334, 196, 86, 20);
		contentPane.add(Autor2);
		Autor2.setColumns(10);
		
		Titulo2 = new JTextField();
		Titulo2.setBounds(474, 197, 86, 20);
		contentPane.add(Titulo2);
		Titulo2.setColumns(10);
		
		Genero2 = new JTextField();
		Genero2.setBounds(334, 255, 86, 20);
		contentPane.add(Genero2);
		Genero2.setColumns(10);
		
		AñoPublicacion2 = new JTextField();
		AñoPublicacion2.setBounds(474, 255, 86, 20);
		contentPane.add(AñoPublicacion2);
		AñoPublicacion2.setColumns(10);
		
		Cantidad2 = new JTextField();
		Cantidad2.setBounds(334, 311, 86, 20);
		contentPane.add(Cantidad2);
		Cantidad2.setColumns(10);
		
		Precio2 = new JTextField();
		Precio2.setColumns(10);
		Precio2.setBounds(475, 311, 86, 20);
		contentPane.add(Precio2);
		
		CuadroConsulta = new JTextField();
		CuadroConsulta.setBounds(68, 450, 86, 20);
		contentPane.add(CuadroConsulta);
		CuadroConsulta.setColumns(10);
		
		/**Este boton es para pedirle un libro a la base de datos y ponerlo en los campos correspondientes**/
	
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/libreria","root" ,"root123");
					Statement comando=conexion.createStatement();
					ResultSet registro = comando.executeQuery("select titulo,autor,genero,añoPublicacion,librosDisponibles,precio from libros where codigo="+CuadroConsulta.getText());
					if (registro.next()==true) {
						Titulo.setText(registro.getString("titulo"));
						Autor.setText(registro.getString("autor"));
						Genero.setText(registro.getString("genero"));
						Publicacion.setText(registro.getString("añoPublicacion"));
						Precio.setText(registro.getString("precio"));
						Cantidad.setText(registro.getString("librosDisponibles"));
						Titulo2.setText(registro.getString("titulo"));
						Autor2.setText(registro.getString("autor"));
						Genero2.setText(registro.getString("genero"));
						AñoPublicacion2.setText(registro.getString("añoPublicacion"));
						Precio2.setText(registro.getString("precio"));
						Cantidad2.setText(registro.getString("librosDisponibles"));
					}else {
						FacturaFinal.setText("No existe un libro con ese codigo");
						
					}
					
				}catch(SQLException ex) {
				setTitle(ex.toString());
				}
			}
		});
		btnConsulta.setBounds(68, 507, 89, 23);
		contentPane.add(btnConsulta);
		
		/**Para usar este boton, hay que consultar el libro que queremos modificar, para poder actualizarlo en los campos de la derecha **/
		
		JButton Actualizar = new JButton("Libro a Actualizar");
		Actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/libreria","root" ,"root123");
					Statement comando=conexion.createStatement();
					comando.executeUpdate("update libros set titulo='" + Titulo2.getText() + "'," + "autor='" 
					+ Autor2.getText() + "',"+ "genero='"+ Genero2.getText() +"',"+ "añoPublicacion="+ AñoPublicacion2.getText() 
					+","+"librosDisponibles="+ Cantidad2.getText()+","+"precio="+ Precio2.getText()+" where codigo="
					+CuadroConsulta.getText());
					
				}catch(SQLException ex) {
				setTitle(ex.toString());
				}
			}
		});
		Actualizar.setBounds(367, 358, 161, 23);
		contentPane.add(Actualizar);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del libro a consultar:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 418, 212, 14);
		contentPane.add(lblNewLabel_1);

	}
}