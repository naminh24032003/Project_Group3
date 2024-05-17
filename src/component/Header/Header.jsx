import Container from 'react-bootstrap/Container'
import Navbar from 'react-bootstrap/Navbar'
import NavDropDown from 'react-bootstrap/NavDropdown'
import Nav from 'react-bootstrap/Nav'
import '../Header/Header.css'
import Button from 'react-bootstrap/esm/Button';

export function Header() {

    return (
        <Navbar expand="md" className='nav-header' fixed='top'>
            <Container fluid>
                <Navbar.Brand href='#Home' className='p-3 fw-bold fst-italic'>
                    <img
                        src='src/assets/diamond-svgrepo-com.svg'
                        width='60'
                        height='60'
                        className=''
                        alt=''
                    />
                    Valuation Diamond
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav" className="me-5 fw-bold justify-content-end">
                    <Nav variant='underline'>
                        <Nav.Link href=''>Home</Nav.Link>
                        <NavDropDown title="Evaluation Service">
                            <NavDropDown.Item href="#action/3.1">Caculate</NavDropDown.Item>
                            <NavDropDown.Divider />
                            <NavDropDown.Item href="#action/3.2">
                                Diamond Valuation Service
                            </NavDropDown.Item>
                            <NavDropDown.Divider />
                            <NavDropDown.Item href="#action/3.3">Diamond valuation policy</NavDropDown.Item>
                            <NavDropDown.Divider />
                            <NavDropDown.Item href="#action/3.4">
                                Type of Valuation
                            </NavDropDown.Item>
                        </NavDropDown>
                        <Nav.Link href=''>Check</Nav.Link>
                        <Nav.Link href=''>Blog</Nav.Link>
                        <Nav.Link href=''>Contact</Nav.Link>
                        <Nav.Link href=''>Languages</Nav.Link>
                        <Button className='border border-dark button-sign-in text-dark fw-bold' href=''>Sign in</Button>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
}